import java.util.ArrayList;
import java.util.List;

import products.Product;

public class Cart {
    private List<Product> productsInCart;

    public Cart() {
        this.productsInCart = new ArrayList<>();
    }

    //metodo geralizzato che verifica prima se si può finalizzare la vendita
    // e poi procede svuotando il carrello e rimuovendo i device venduti dal magazzino;

    public static void finalizeSellingProcess(boolean paymentCheck, Warehouse warehouse, Cart cart) {
        if (paymentCheck) {
            warehouse.getProductsInStock().removeAll(cart.getProductsInCart());
            cart.getProductsInCart().clear();
        } else {
            System.out.println("you must first complete a form of payment");
        }
    }


    public List<Product> getProductsInCart() {
        return productsInCart;
    }

    public void addProductInCart(Product product) {
        productsInCart.add(product);
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

    @Override
    public String toString() {
        return "Cart{" +
                "productsInCart=" + productsInCart +
                '}';
    }
}
    
