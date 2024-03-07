import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Product> productsInStock = new ArrayList<Product>();

    public void addProductToStock(Product product) {
        productsInStock.add(product);
    }

    public Warehouse() {
    }

    public List<Product> getProductsInStock() {
        return productsInStock;
    }

    public List<Product> getMatchingResearch (String input, String typeResearched){
        List<Product> matchingDevices = new ArrayList<>();

        return matchingDevices;
    }

    public List<Product> getMatchingSaleRange(Integer minPrice, Integer maxPrice) {
        if (minPrice == null || maxPrice == null) {
            return null;
        }
        List<Product> matchingDevices = new ArrayList<>();
        for (Product product : productsInStock) {
            if (product.getSalePrice() <= maxPrice && product.getSalePrice() >= minPrice) {
                matchingDevices.add(product);
            }
        }
        return matchingDevices;
    }
}
