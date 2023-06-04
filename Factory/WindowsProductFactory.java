package Factory;

import Product.ProductAlert;
import Product.ProductButton;
import Product.alert.WindowsProductAlert;
import Product.button.WindowsAlertbutton;

public class WindowsProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new WindowsProductAlert();
    }

    @Override
    public ProductButton getProductButton() {
        return new WindowsAlertbutton();
    }
}
