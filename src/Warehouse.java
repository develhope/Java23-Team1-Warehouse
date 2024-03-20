import products.Product;

import javax.naming.directory.InvalidSearchFilterException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Product> devices;

    public void finalizeSellingProcess(boolean paymentCheck, Cart cart) {
        devices.removeAll(cart.getDevices());
        cart.getDevices().clear();
    }


    public void addProductToStock(Product product) {
        devices.add(product);
    }

    public Warehouse() {
        this.devices = new ArrayList<Product>();
    }

    public List<Product> getProductsInStock() {
        return devices;
    }

    // Method that take a filter as parameter and cycle through the warehouse. If the product match the filter parameter and return true,
    //it adds the product to a new list.
    public List<Product> search(ProductFilter productFilter) {
        List<Product> matchingDevices = new ArrayList<>();
        try {
            for (Product product : getProductsInStock()) {
                if (productFilter.isInFilter(product)) {
                    matchingDevices.add(product);
                }
            }
        } catch (InvalidSearchFilterException e) {
            System.out.println("Invalid research: " + e.getMessage());
        }
        return matchingDevices;
    }

    public List<Product> filterBySaleRange(Integer minPrice, Integer maxPrice) {
        if (minPrice == null || maxPrice == null) {
            return null;
        }
        List<Product> matchingDevices = new ArrayList<>();
        for (Product product : devices) {
            if (product.getSalePrice() <= maxPrice && product.getSalePrice() >= minPrice) {
                matchingDevices.add(product);
            }
        }
        return matchingDevices;
    }


    public boolean isEmpty() {
        return devices.isEmpty();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "productsInStock=" + devices +
                '}';
    }

    public List<Product> filterByPurchaseRange(Integer minPrice, Integer maxPrice) {
        if (minPrice == null || maxPrice == null) {
            return null;
        }
        List<Product> matchingDevices = new ArrayList<>();
        for (Product product : devices) {
            if (product.getPurchasePrice() <= maxPrice && product.getPurchasePrice() >= minPrice) {
                matchingDevices.add(product);
            }
        }
        return matchingDevices;
    }
}
