package my.sample.domain.model;

import java.io.Serializable;
import java.util.List;

public class BookShelf implements Serializable {

    private static final long serialVersionUID = -7003704026056171806L;
    private String shelfId;
    private List<Book> books;

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
