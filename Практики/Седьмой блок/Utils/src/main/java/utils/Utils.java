package utils;

public class Utils {
    public static long calculateFolderSize(String directory) {
        var path = java.nio.file.Paths.get(directory);

        if (!java.nio.file.Files.exists(path) || !java.nio.file.Files.isDirectory(path)) {
            throw new IllegalArgumentException();
        }

        var size = new long[]{0};

        try {
            java.nio.file.Files.walkFileTree(path,
                    new java.nio.file.SimpleFileVisitor<java.nio.file.Path>() {
                public java.nio.file.FileVisitResult visitFile(
                        java.nio.file.Path file,
                        java.nio.file.attribute.BasicFileAttributes attrs
                ) throws java.io.IOException {
                    size[0] += attrs.size();
                    return java.nio.file.FileVisitResult.CONTINUE;
                }
            });
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }

        return size[0];
    }

    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        var source = java.nio.file.Paths.get(sourceDirectory).toAbsolutePath().normalize();
        var destination = java.nio.file.Paths.get(destinationDirectory).toAbsolutePath().normalize();

        if (!java.nio.file.Files.exists(source) || !java.nio.file.Files.isDirectory(source)) {
            throw new IllegalArgumentException();
        }
        if (source.equals(destination) || destination.startsWith(source)) {
            throw new IllegalArgumentException();
        }

        var visitor = new MyFileVisitor();

        try {
            java.nio.file.Files.walkFileTree(source, visitor);
            var directories = visitor.getDirectories();
            var files = visitor.getFiles();

            for (var directory : directories) {
                var relativePath = source.relativize(directory);
                var targetDirectory = destination.resolve(relativePath);
                java.nio.file.Files.createDirectories(targetDirectory);
            }

            for (var file : files) {
                var relativePath = source.relativize(file);
                var targetFile = destination.resolve(relativePath);
                java.nio.file.Files.copy(file,targetFile,
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}