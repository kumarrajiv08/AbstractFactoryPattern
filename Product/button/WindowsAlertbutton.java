package Product.button;

import Product.ProductButton;

public class WindowsAlertbutton implements ProductButton {
    @Override
    public void press() {
        System.out.println("Windows button");
    }
}
