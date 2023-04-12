package ProductFactory;
import java.time.LocalDateTime;

public class ProductFactory {
    private static int totalProducts = 0;
    private static int totalFoodProducts = 0;
    private static int nonFoodProductCount = 0;

    public static Product createProduct(LocalDateTime productionDateTime, LocalDateTime expirationDateTime) {
        Product product = new FoodProduct(productionDateTime, expirationDateTime);
        totalProducts++;
        totalFoodProducts++;
        return product;
    }

    public static Product createNonFoodProduct(LocalDateTime productionDate, LocalDateTime expirationDate) {
        nonFoodProductCount++;
        totalProducts++;
        return new NonFoodProduct(productionDate, expirationDate);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static int getTotalFoodProducts() {
        return totalFoodProducts;
    }

    public static int getNonFoodProductCount() {
        return nonFoodProductCount;
    }
}
