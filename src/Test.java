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
         List<Product> productsInStock = new Warehouse(new ArrayList<>()).getProductsInStock();
        productsInStock.add(smartphone1);
        productsInStock.add(smartphone2);
        productsInStock.add(tablet1);
        productsInStock.add(tablet2);
        productsInStock.add(notebook1);
        productsInStock.add(notebook2);
        List<Product> productsInCart = new ArrayList<>();
        productsInCart.add(smartphone1);
        productsInCart.add(tablet1);
        productsInCart.add(notebook1);
        boolean paymentCheck = true;
        Cart.finalizeSellingProcess(paymentCheck, productsInCart, productsInStock);
        System.out.println(productsInStock);
        System.out.println(productsInCart);


    }
}
