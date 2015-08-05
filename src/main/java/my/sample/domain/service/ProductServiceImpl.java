package my.sample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.sample.domain.model.BookShelf;
import my.sample.domain.repository.BookRepository;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private BookRepository bookRepository;

    public BookShelf getBookShelf(String id) {
        return bookRepository.find(id);
    }

    public List<BookShelf> getBookShelfs(String id) {
        return bookRepository.find2(id);
    }
}