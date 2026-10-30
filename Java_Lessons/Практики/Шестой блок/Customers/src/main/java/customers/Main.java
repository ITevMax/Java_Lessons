package customers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var storage = new CustomerStorage();

        try (var scanner = new Scanner(System.in)) {
            while (true) {
                if (!scanner.hasNextLine()) {
                    break;
                }

                var input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    continue;
                }

                var parts = input.split("\\s+", 2);
                var command = parts[0].toLowerCase();
                var data = parts.length > 1 ? parts[1] : "";

                try {
                    switch (command) {
                        case "add":
                            storage.addCustomer(data);
                            break;

                        case "list":
                            if (!data.isEmpty()) {
                                throw new IllegalArgumentException();
                            }

                            storage.listCustomers();
                            break;

                        case "remove":
                            storage.removeCustomer(data);
                            break;

                        case "count":
                            if (!data.isEmpty()) {
                                throw new IllegalArgumentException();
                            }
                            System.out.println(storage.getCount());
                            break;

                        case "help":
                            if (!data.isEmpty()) {
                                throw new IllegalArgumentException();
                            }

                            System.out.println("Доступные команды:");
                            System.out.println(
                                    "add <имя> <фамилия> <email> <телефон>"
                            );
                            System.out.println("remove <имя> <фамилия>");
                            System.out.println("list");
                            System.out.println("count");
                            System.out.println("help");
                            System.out.println("exit");
                            System.out.println(
                                    "Пример: add Ivan Ivanov ivan@mail.ru +79991234567"
                            );
                            break;

                        case "exit":
                            if (!data.isEmpty()) {
                                throw new IllegalArgumentException();
                            }
                            return;

                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка ввода команды");
                }
            }
        }
    }
}