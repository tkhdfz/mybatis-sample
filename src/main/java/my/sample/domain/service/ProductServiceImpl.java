package my.sample.domain.service;

import java.util.List;

import my.sample.domain.model.BookShelf2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.sample.domain.model.BookShelf;
import my.sample.domain.repository.BookRepository;

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