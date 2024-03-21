import java.util.ArrayList;
import java.util.List;

import products.Product;


public class Cart {
    private List<Product> devices;

    public Cart() {
        this.devices = new ArrayList<>();
    }
     public List<Product> removeFromCartByID( int id) {

        for (Product device :devices){
            if(device.getId() == id){
                devices.remove(device);
            }
        }
        return devices;
    }


    public List<Product> getDevices() {
        return devices;
    }

    public void addProductInCart(Product product) {
        devices.add(product);
    }

    public void setProductsInCart(List<Product> productsInCart) {
        this.devices = productsInCart;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : devices) {
            totalPrice += product.getSalePrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productsInCart=" + devices +
                '}';
    }
}
    
