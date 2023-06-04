package Product.alert;

import Product.ProductAlert;

public class LinuxProductAlert implements ProductAlert {
    @Override
    public void alert() {
        System.out.println("Linux Alert");
    }
}
