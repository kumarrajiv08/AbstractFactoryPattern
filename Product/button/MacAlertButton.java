package Product.button;

import Product.ProductButton;

public class MacAlertButton implements ProductButton {
    @Override
    public void press() {
        System.out.println("Mac button pressed");
    }
}
