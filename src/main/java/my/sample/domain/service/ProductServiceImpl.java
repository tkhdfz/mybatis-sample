package my.sample.domain.service;

import my.sample.domain.model.BookShelf;
import my.sample.domain.model.BookShelf2;
import my.sample.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public BookShelf getBookShelf(String id) {
        return bookRepository.find(id);
    }

    @Override
    public BookShelf2 getBookShelf2(String isbn) {
        return bookRepository.find3(isbn);
    }

    @Override
    public List<BookShelf> getBookShelves(String id) {
        return bookRepository.find2(id);
    }
}
