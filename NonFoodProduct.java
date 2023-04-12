package ProductFactory;
import java.time.LocalDateTime;

public class NonFoodProduct extends Product{
    public NonFoodProduct(LocalDateTime productionDate, LocalDateTime expirationDate) {
        super(productionDate, expirationDate);
    }
}
