package book.system;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        if (name.isBlank() || surname.isBlank())
            throw new IllegalArgumentException("Фамилия и имя должны быть заполнены");

        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}