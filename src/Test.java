import products.Devices;
import products.Product;

import java.util.ArrayList;
import java.util.List;
// QUESTA CLASSE è ESCLUSIVAMENTE CREATA PER TESTARE LE ROBE

public class Test {
    private ResearchMethod researchMethod;
    private Warehouse warehouse;

    public static void main(String[] args) throws IllegalAccessException {
        Product smartphone1 = new Product(Devices.SMARTPHONE, "Xiaomi", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product tablet1 = new Product(Devices.TABLET, "Apple", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product notebook1 = new Product(Devices.NOTEBOOK, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product smartphone2 = new Product(Devices.SMARTPHONE, "Xiaomi", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product tablet2 = new Product(Devices.TABLET, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product notebook2 = new Product(Devices.NOTEBOOK, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Warehouse productsInStock = new Warehouse();
        productsInStock.addProductToStock(smartphone1);
        productsInStock.addProductToStock(smartphone2);
        productsInStock.addProductToStock(tablet1);
        productsInStock.addProductToStock(tablet2);
        productsInStock.addProductToStock(notebook1);
        productsInStock.addProductToStock(notebook2);


        Cart productsInCart = new Cart();
        productsInCart.addProductInCart(smartphone1);
        productsInCart.addProductInCart(tablet1);
        productsInCart.addProductInCart(notebook1);
        boolean paymentCheck = true;
        Cart.finalizeSellingProcess(paymentCheck, productsInCart.getProductsInCart(), productsInStock.getProductsInStock());
        System.out.println(productsInStock);
        System.out.println(productsInCart);


    }
}
