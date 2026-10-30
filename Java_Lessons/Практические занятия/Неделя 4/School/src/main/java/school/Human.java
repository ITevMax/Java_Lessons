package school;

public abstract class Human {
    final String name;
    final String surname;
    private boolean inSchool = false;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void goInSchool() {
        inSchool = true;
    }

    public void outFromSchool() {
        inSchool = false;
    }

    public boolean isInSchool() {
        return inSchool;
    }
}