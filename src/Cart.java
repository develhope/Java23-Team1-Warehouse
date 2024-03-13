import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import products.Product;

public class Cart {
    private List<Product> productsInCart;

    public Cart() {
        this.productsInCart = new ArrayList<>();
    }

    public List<Product> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(List<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : productsInCart) {
            totalPrice += product.getSalePrice();
        }
        return totalPrice;
    }

    // RIMOZIONE DI UN ELEMENTO DAL CARRELLO TRAMITE ID
    public List<Product> removeProductsInCartById() {
        if (productsInCart.isEmpty()) {
            System.out.println("The cart is empty.");
            return null;
        } else {
            List<Product> updatedWareHouse =  ((Cart) productsInCart).getProductsInCart();
            if (updatedWareHouse.isEmpty()) {
                System.out.println("The cart is empty.");
                return null;
            } else {
                return updatedWareHouse;
            }
        }
    }
}