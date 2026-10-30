package system.authentication;

public class Main {
    static void main() {
        var someSite = new AuthenticationSystem("Мой сайт");

        someSite.createAccount("admin", "admin");
        someSite.createAccount("user", "12345");
        someSite.lockAccount("user");

        try {
            someSite.login("admin", "admin");
        } catch (InvalidCredentialsException |
                 UserNotFoundException |
                 AccountLockedException e) {
            System.out.println(e.getMessage());
        }

        try {
            someSite.createAccount("admin", "123");
        } catch (InvalidCredentialsException |
                 UserNotFoundException |
                 AccountLockedException e) {
            System.out.println(e.getMessage());
        }

        try {
            someSite.login("admin1", "admin1");
        } catch (InvalidCredentialsException |
                 UserNotFoundException |
                 AccountLockedException e) {
            System.out.println(e.getMessage());
        }

        try {
            someSite.login("админ", "123");
        } catch (InvalidCredentialsException |
                 UserNotFoundException |
                 AccountLockedException e) {
            System.out.println(e.getMessage());
        }

        try {
            someSite.login("user", "12345");
        } catch (InvalidCredentialsException |
                 UserNotFoundException |
                 AccountLockedException e) {
            System.out.println(e.getMessage());
        }
    }
}