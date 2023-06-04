package Factory;

import Product.ProductAlert;
import Product.ProductButton;
import Product.alert.MacProductAlert;
import Product.button.MacAlertButton;

public class MacProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new MacProductAlert();
    }

    @Override
    public ProductButton getProductButton() {
        return new MacAlertButton();
    }
}
