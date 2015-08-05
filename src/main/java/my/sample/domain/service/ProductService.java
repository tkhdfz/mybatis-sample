package my.sample.domain.service;

import java.util.List;

import my.sample.domain.model.BookShelf;

public interface ProductService {
    BookShelf getBookShelf(String id);
    List<BookShelf> getBookShelfs(String id);
}
