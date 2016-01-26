package my.sample.domain.service;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;

import java.util.List;

public interface ProductService {
    BookShelf getBookShelf(String id);
    List<BookShelf> getBookShelfs(String id);
    void insertBook(Book book);
    void updateBook(Book book);
    List<Book> findAll();
}
