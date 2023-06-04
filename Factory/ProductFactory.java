package Factory;

import Product.ProductAlert;
import Product.ProductButton;

public interface ProductFactory {
    ProductAlert getProductAlert();
    ProductButton getProductButton();
}
