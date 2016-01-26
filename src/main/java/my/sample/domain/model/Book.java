package my.sample.domain.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 4220483814372170681L;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
}
