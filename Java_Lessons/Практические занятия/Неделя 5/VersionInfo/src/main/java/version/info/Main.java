package version.info;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.List;

public class Main {
    static void main(String[] args) {
        var classes = new Class[]{
                GettingExampleClass.class,
                Printer.class,
                WithoutAnnotation.class,
                YetAnotherClass.class
        };
        for (var _class : classes) {
            var annotation = (VersionInfo)_class.getAnnotation(VersionInfo.class);
            if (annotation == null)
                System.out.println("No annotation at class " + _class);
            else {
                System.out.printf(
                        "Author: %s\n" +
                        "Version: %s\n" +
                        "Description: %s",
                        annotation.author(),
                        annotation.version(),
                        annotation.description()
                );
            }
        }
    }
}