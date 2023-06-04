package Factory;

import Product.ProductAlert;
import Product.ProductButton;
import Product.alert.LinuxProductAlert;
import Product.button.LinuxAlertButton;

public class LinuxProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new LinuxProductAlert();
    }

    @Override
    public ProductButton getProductButton() {
        return new LinuxAlertButton();
    }
}
