package school;

public class Pupil extends Human {
    private int year;

    public Pupil(String name, String surname, int year) {
        super(name, surname);
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("%s %s %d", name, surname, year);
    }
}