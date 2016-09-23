package my.sample.domain.service;

import my.sample.domain.model.BookShelf;
import my.sample.domain.model.BookShelf2;

import java.util.List;

public interface ProductService {
    BookShelf getBookShelf(String id);

    BookShelf2 getBookShelf2(String isbn);

    List<BookShelf> getBookShelves(String id);
}
