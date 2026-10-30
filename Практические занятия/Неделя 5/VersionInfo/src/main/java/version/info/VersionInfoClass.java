package version.info;

@VersionInfo(
        author = "ITev-Max",
        version = "2.3",
        description = "Class for getting private field"
)
class GettingExampleClass {
    public void getAnything() {
    }
}

@VersionInfo(
        author = "ITev-Max",
        version = "1.1",
        description = "Printing \"Anything\" for educational purposes"
)
class Printer {
    public void printAnything() {
        System.out.println("Anything");
    }
}

class WithoutAnnotation {
    public void emptyMethod() { }
}

@VersionInfo(
        author = "Anybody",
        version = "3.125",
        description = "Just added class"
)
class YetAnotherClass {
    public void iDontKnow() { }
}
