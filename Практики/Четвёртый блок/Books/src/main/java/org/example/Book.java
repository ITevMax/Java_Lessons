package org.example;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isRead;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isRead = false;
    }

    public void displayInfo() {
        System.out.printf("Title of this book: %s\n" +
                             "Author of this book: %s\n" +
                             "Year: %d\n" +
                             "Is Read: " + (isRead ? "Yes\n" : "No\n"),
                            title, author, year);
    }

    public void markAsRead() {
        isRead = true;
    }
}