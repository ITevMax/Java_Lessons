package book.system;

public final class Book {
    private final String title;
    private final Author author;
    private final Genre genre;
    private final int publicationYear;

    public Book(
            String title,
            Author author,
            Genre genre,
            int publicationYear
    ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}