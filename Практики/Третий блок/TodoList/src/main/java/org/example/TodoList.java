package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        var scanner = new Scanner(System.in);
        while (true) {
            var command = scanner.nextLine().toLowerCase().split(" ");
            if (command.length > 2) {
                if (command[0].equals("add")) {
                    System.out.println("Задача была успешно добавлена");
                    add(Integer.parseInt(command[1]), command[2]);
                }
                if (command[0].equals("edit")) {
                    edit(command[1], Integer.parseInt(command[2]));
                    System.out.println("Задача была успешно отредактирована");
                }
            } else {
                if (command[0].equals("exit")) break;
                if (command[0].equals("add")) {
                    System.out.println("Задача была успешно добавлена");
                    add(command[1]);
                }
                if (command[0].equals("delete")){
                    delete(Integer.parseInt(command[1]));
                    System.out.println("Задача была успешно удалена");
                }
                if (command[0].equals("list")) System.out.println(getTodos());
            }
        }
    }

    private ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка

        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления

        if (index >= 0 && index <= todoList.size())
            todoList.add(index, todo);
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if (index >= 0 && index <= todoList.size()) {
            todoList.remove(index);
            todoList.add(index, todo);
        }
    }

    public void delete(int index) {
        //TODO: удалить дело находящееся по переданному индексу,
        // проверьте возможность удаления дела

        if (index >= 0 && index <= todoList.size())
            todoList.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел

        return todoList;
    }
}