package book.system;

import java.util.List;

public interface Searchable
{
    public List<Book> searchByTitle(String title);
}