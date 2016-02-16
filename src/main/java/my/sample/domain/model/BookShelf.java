package my.sample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookShelf implements Serializable {

    private static final long serialVersionUID = -7003704026056171806L;
    private String shelfId;
    private List<Book> books;

}
