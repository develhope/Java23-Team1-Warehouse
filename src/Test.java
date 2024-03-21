import Filters.FilterByDevice;
import Products.Devices;
import Products.Product;

import java.util.ArrayList;
import java.util.List;
// QUESTA CLASSE è ESCLUSIVAMENTE CREATA PER TESTARE LE ROBE

public class Test {
    private ResearchMethod researchMethod;
    private Warehouse warehouse;

    public static void main(String[] args) {
        Product smartphone1 = new Product(Devices.SMARTPHONE, "Xiaomi", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product tablet1 = new Product(Devices.TABLET, "Apple", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product notebook1 = new Product(Devices.NOTEBOOK, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product smartphone2 = new Product(Devices.SMARTPHONE, "Xiaomi", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product tablet2 = new Product(Devices.TABLET, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        Product notebook2 = new Product(Devices.NOTEBOOK, "Samsung", "Mi A1", "Un cellulare vecchio", 150f, 1, 90, 130, 1234);
        List<Product> products = new ArrayList<>();
        Warehouse warehouse = new Warehouse();
        ResearchMethod researchMethod = new ResearchMethod(warehouse);
        warehouse.addProductToStock(tablet1);
        warehouse.addProductToStock(tablet2);
        warehouse.addProductToStock(smartphone1);
        warehouse.addProductToStock(smartphone2);
        warehouse.addProductToStock(notebook1);
        warehouse.addProductToStock(notebook2);
        researchMethod.searchByBrand("SAMSUNG");
        products.add(smartphone1);
        products.add(smartphone2);
        products.add(tablet1);
        products.add(tablet2);
        products.add(notebook1);
        products.add(notebook2);
        Cart productsInCart = new Cart();
        Warehouse productsInStock = new Warehouse();
        productsInStock.addProductToStock(smartphone1);
        productsInStock.addProductToStock(smartphone2);
        productsInStock.addProductToStock(tablet1);
        productsInStock.addProductToStock(tablet2);
        productsInStock.addProductToStock(notebook1);
        productsInStock.addProductToStock(notebook2);
        productsInCart.addProductInCart(smartphone1);
        productsInCart.addProductInCart(tablet1);
        productsInCart.addProductInCart(notebook1);
        boolean paymentCheck = true;
        productsInStock.finalizeSellingProcess(true, productsInCart);
        //System.out.println(productsInStock);
        //System.out.println(productsInCart);
        //System.out.println(researchMethod.search(new Filters.FilterByBrand("Xiaomi")));
        System.out.println(researchMethod.search(new FilterByDevice(Devices.NOTEBOOK)));
    }
}
