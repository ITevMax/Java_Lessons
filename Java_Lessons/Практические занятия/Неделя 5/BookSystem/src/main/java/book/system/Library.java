package book.system;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private final List<Book> books = new ArrayList<>();
    private final List<Book> takenBooks = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Книга должна быть заполнена");

        books.add(book);
    }

    public void removeBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("Книга должна быть заполнена");

        books.remove(book);
    }

    public List<Book> getBooks() {
        return List.copyOf(books);
    }

    public List<Book> searchByTitle(String title) {
        if (title == null) {
            return List.of();
        }

        var foundBooks = new ArrayList<Book>();

        for (var book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase()))
                foundBooks.add(book);
        }

        return foundBooks;
    }

    public List<Book> searchByAuthor(Author author) {
        if (author == null) {
            return List.of();
        }

        var foundBooks = new ArrayList<Book>();

        for (var book : books) {
            if (book.getAuthor().getFullName().equals(author.getFullName()))
                foundBooks.add(book);
        }

        return foundBooks;
    }

    public List<Book> searchByGenre(Genre genre) {
        if (genre == null) {
            return List.of();
        }

        var foundBooks = new ArrayList<Book>();

        for (var book : books) {
            if (book.getGenre().equals(genre))
                foundBooks.add(book);
        }

        return foundBooks;
    }

    public List<Book> searchByYear(int year) {
        var foundBooks = new ArrayList<Book>();

        for (var book : books) {
            if (book.getPublicationYear() == year)
                foundBooks.add(book);
        }

        return foundBooks;
    }
}