import products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Product> filterByAttribute(String input, String typeResearched) {
        List<Product> matchingDevices = new ArrayList<>();

        return matchingDevices;
    }

    public List<Product> filterByModel(List<Product> productsInStock, String model) {
        List<Product> devicesFilteredByModel = new ArrayList<>();

        for (Product device : productsInStock) {
            if (Objects.equals(device.getModel(), model)) {
                devicesFilteredByModel.add(device);
            }

        }
        return devicesFilteredByModel;
    }

    public List<Product> filterBySaleRange(Integer minPrice, Integer maxPrice) {
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
