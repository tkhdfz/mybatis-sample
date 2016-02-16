package my.sample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 4220483814372170681L;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
}
