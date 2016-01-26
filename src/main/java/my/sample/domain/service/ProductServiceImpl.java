package my.sample.domain.service;

import my.sample.domain.model.Book;
import my.sample.domain.model.BookShelf;
import my.sample.domain.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private BookRepository bookRepository;

    public BookShelf getBookShelf(String id) {
        return bookRepository.find(id);
    }

    public List<BookShelf> getBookShelfs(String id) {
        return bookRepository.find2(id);
    }

    public void insertBook(Book book) {
        bookRepository.insert(book);

    }

    public void updateBook(Book book) {
        if (bookRepository.update(book) != 1) {
            throw new BusinessException("更新件数が1件以上あった");
        }
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

}
