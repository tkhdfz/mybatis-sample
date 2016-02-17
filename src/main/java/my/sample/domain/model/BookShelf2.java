package my.sample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookShelf2 implements Serializable {

    private static final long serialVersionUID = -6176991460988847140L;
    private String shelfId;
    private Book book;

}
