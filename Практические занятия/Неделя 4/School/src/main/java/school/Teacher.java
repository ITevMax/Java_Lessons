package school;

public class Teacher extends Human {
    private String subject;
    private int experience;

    public Teacher(String name, String surname, String subject, int experience) {
        super(name, surname);
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {
        return String.format("%s %s %s %d", name, surname, subject, experience);
    }
}