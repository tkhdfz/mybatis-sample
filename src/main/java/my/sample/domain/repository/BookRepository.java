package my.sample.domain.repository;

import java.util.List;

import my.sample.domain.model.BookShelf;
import my.sample.domain.model.BookShelf2;

public interface BookRepository {
    BookShelf find(String id);
    List<BookShelf> find2(String id);
    BookShelf2 find3(String isbn);
}
