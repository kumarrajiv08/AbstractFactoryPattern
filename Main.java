import Factory.LinuxProductFactory;
import Factory.ProductFactory;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new LinuxProductFactory();
        productFactory.getProductAlert().alert();
        productFactory.getProductButton().press();
    }
}
