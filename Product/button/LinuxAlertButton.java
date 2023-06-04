package Product.button;

import Product.ProductButton;

public class LinuxAlertButton implements ProductButton {
    @Override
    public void press() {
        System.out.println("Linux button pressed");
    }
}
