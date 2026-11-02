package utils;

public class MyFileVisitor extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
    private final java.util.List<java.nio.file.Path> files = new java.util.ArrayList<>();
    private final java.util.List<java.nio.file.Path> directories = new java.util.ArrayList<>();

    public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir,
            java.nio.file.attribute.BasicFileAttributes attrs
    ) {
        directories.add(dir);
        return java.nio.file.FileVisitResult.CONTINUE;
    }

    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file,
            java.nio.file.attribute.BasicFileAttributes attrs
    ) throws java.io.IOException {
        files.add(file);
        return java.nio.file.FileVisitResult.CONTINUE;
    }

    public java.util.List<java.nio.file.Path> getFiles() {
        return files;
    }

    public java.util.List<java.nio.file.Path> getDirectories() {
        return directories;
    }
}