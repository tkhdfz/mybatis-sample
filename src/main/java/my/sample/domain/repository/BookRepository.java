package my.sample.domain.repository;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;

import java.util.List;

public interface BookRepository {
    BookShelf find(String id);
    List<BookShelf> find2(String id);
    void insert(Book book);
    int update(Book book);
    List<Book> findAll();
}
