package my.sample.domain.service;

import java.util.List;

import my.sample.domain.model.BookShelf;
import my.sample.domain.model.BookShelf2;

public interface ProductService {
    BookShelf getBookShelf(String id);
    BookShelf2 getBookShelf2(String isbn);
    List<BookShelf> getBookShelves(String id);
}
