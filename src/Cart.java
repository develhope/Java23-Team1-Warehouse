import java.util.ArrayList;
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

    public float getFinalPrice() {
        float finalPrice = 0;
        for (Product product : productsInCart) {
            finalPrice += product.getSalePrice();
        }
        return finalPrice;
    }
}