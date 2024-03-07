import java.util.ArrayList;
import java.util.List;

import products.Product;

public class Cart {
    private List<Product> productsInCart;
    private float finalPrice;

    public Cart(String productsInStock, float finalPrice) {
        this.productsInCart = new ArrayList<>();
        this.finalPrice = finalPrice;
    }

    public List<Product> getProductsInCart() {
        return productsInCart;
    }

    public void setProductsInCart(List<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }
}