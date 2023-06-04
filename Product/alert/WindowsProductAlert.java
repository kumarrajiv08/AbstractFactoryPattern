package Product.alert;

import Product.ProductAlert;

public class WindowsProductAlert implements ProductAlert {
    @Override
    public void alert() {
        System.out.println("Windows Alert");
    }
}
