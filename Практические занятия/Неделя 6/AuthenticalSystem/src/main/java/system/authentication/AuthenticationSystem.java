package system.authentication;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AuthenticationSystem {
    private final List<String> lockedAccounts = new ArrayList<>();
    private final Map<String, String> users = new HashMap<>();
    private final String nameOfSystem;

    public AuthenticationSystem(String nameOfSystem) {
        this.nameOfSystem = nameOfSystem;
    }

    public List<String> getLockedAccounts() {
        return lockedAccounts;
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public String getNameOfSystem() {
        return nameOfSystem;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthenticalSystem{");
        sb.append("lockedAccounts=").append(lockedAccounts);
        sb.append(", users=").append(users);
        sb.append(", nameOfSystem='").append(nameOfSystem).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void createAccount(String username, String password) {
        if (users.containsKey(username.toLowerCase())) {
            System.out.println("Аккаунт уже был создан ранее");
            return;
        }

        var isContainsInvalidCredentials = (username + password).matches(".*[а-яёЁА-Я].*");
        if (isContainsInvalidCredentials
                || username.isBlank() || password.isBlank()) {
            throw new InvalidCredentialsException(
                    "Внутри логина или пароля присутствуют" +
                            "русские символы или не содержит символы вовсе"
            );
        }

        users.put(username.toLowerCase(), password);
        System.out.println("Аккаунт был успешно создан");
    }

    public void lockAccount(String username) {
        if (!users.containsKey(username))
            throw new UserNotFoundException("Пользователь не найден");

        lockedAccounts.add(username);
        System.out.printf(
                "Аккаунт %s был заблокирован\n",
                username.toLowerCase()
        );
    }

    public void login(String username, String password) {
        var isContainsInvalidCredentials = (username + password).matches(".*[а-яёЁА-Я].*");
        if (isContainsInvalidCredentials
                || username.isBlank() || password.isBlank()) {
            throw new InvalidCredentialsException(
                    "Внутри логина или пароля присутствуют русские символы" +
                            "или не содержит символы вовсе");
        }
        if (!users.containsKey(username)) {
            throw new UserNotFoundException("Пользователь не был найден");
        }
        if (lockedAccounts.contains(username)) {
            throw new AccountLockedException(
                    "Аккаунт был заблокирован по неизвестным причинам");
        }
        if (!users.get(username).contains(password)) {
            throw new InvalidCredentialsException("Неверный пароль");
        }
        System.out.printf(
                "Авторизация пользователя %s прошла успешно\n",
                username
        );
    }
}