package ProductFactory;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime productionDateTime = LocalDateTime.now();
        LocalDateTime expirationDateTime = productionDateTime.plusDays(7);

        Product product1 = new FoodProduct(productionDateTime, expirationDateTime);
        Product product2 = new FoodProduct(productionDateTime, expirationDateTime);
        Product product3 = new FoodProduct(productionDateTime, expirationDateTime);
        Product product4 = new NonFoodProduct(productionDateTime, expirationDateTime);
        Product product5 = new NonFoodProduct(productionDateTime, expirationDateTime);
        Product product6 = new NonFoodProduct(productionDateTime, expirationDateTime);
        
        ProductFactory.createProduct(productionDateTime, expirationDateTime);
        ProductFactory.createProduct(productionDateTime, expirationDateTime);

        System.out.println("Factory produced " + ProductFactory.getTotalFoodProducts() + " food products");
        System.out.println("Factory produced " + (ProductFactory.getNonFoodProductCount() + " non-food products"));
        System.out.println("Total food products created: " + (ProductFactory.getTotalFoodProducts()));
        System.out.println("Total non-food products created: " + (ProductFactory.getNonFoodProductCount()));

    }
}
