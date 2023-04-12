package ProductFactory;
import java.time.LocalDateTime;

public class FoodProduct extends Product{
    public FoodProduct(LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        super(productionDateTime, expirationDateTime);
    }
}
