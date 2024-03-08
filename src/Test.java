import products.Devices;
import products.Product;

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
        products.add(smartphone1);
        products.add(smartphone2);
        products.add(tablet1);
        products.add(tablet2);
        products.add(notebook1);
        products.add(notebook2);


    }
}
