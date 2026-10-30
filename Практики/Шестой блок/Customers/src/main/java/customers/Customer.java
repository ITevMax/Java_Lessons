package customers;

public class Customer {
    private final String name;
    private final String surname;
    private final String email;
    private final String phone;

    public Customer(
            String name,
            String surname,
            String email,
            String phone
    ) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (email == null || !email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new IllegalArgumentException();
        }
        if (phone == null || !phone.matches("\\+?\\d+")) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return String.format(
                "%s - %s - %s - %s",
                name, surname, email, phone
        );
    }
}