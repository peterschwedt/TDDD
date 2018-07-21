package pl.sda.tdd;
import lombok.Builder;
import lombok.Singular;
import lombok.Data;
import java.util.List;
@Data
@Builder
public class Basket {
    private List<Book> books;

}
