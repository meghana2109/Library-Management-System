import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    public int bookId;
    public String bookName;
    public String category;
    public int numberOfPages;
    public String author;
}
