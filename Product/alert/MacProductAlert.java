package Product.alert;

import Product.ProductAlert;

public class MacProductAlert implements ProductAlert {
    @Override
    public void alert() {
        System.out.println("Mac Alert");
    }
}
