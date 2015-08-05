package my.sample.domain.repository;

import java.util.List;

import my.sample.domain.model.BookShelf;

public interface BookRepository {
    BookShelf find(String id);
    List<BookShelf> find2(String id);
}
