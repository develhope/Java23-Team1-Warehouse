import java.util.*;

import products.Devices;
import products.Product;

public class ResearchMethod {

    private final Warehouse warehouse;

    public ResearchMethod(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void searchByType(List<Product> stockDevices, String typeResearch) {
        List<Product> matchingDevices = new ArrayList<Product>();
        Devices researchTypeEnum = Devices.valueOf(typeResearch.toUpperCase());
        if (warehouse.getProductsInStock().isEmpty()) {
            System.out.println("No available devices");
        } else {
            for (Product product : stockDevices) {
                if (product.getDeviceType() == researchTypeEnum) {
                    matchingDevices.add(product);
                }
            }
        }
        printDevices(matchingDevices);
    }

    public void searchByPriceRange(String minPrice, String maxPrice) {
        if (warehouse.getProductsInStock().isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
        }
        int minPriceResearched = Integer.parseInt(minPrice);
        int maxPriceResearched = Integer.parseInt(maxPrice);
        if (minPriceResearched > maxPriceResearched) {
            System.out.println("Minimum price can't be higher that maximum price!");
        }
        List<Product> productsInsideRange = warehouse.filterBySaleRange(minPriceResearched, maxPriceResearched);
        printDevices(productsInsideRange);
    }

    public void searchByBrand (String input) {
        if (warehouse.getProductsInStock().isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
        }
        List<Product> matchingDevices = new ArrayList<Product>();
        matchingDevices = warehouse.filterByAttribute(input, "brand");
        printDevices(matchingDevices);
    }

    public void printDevices(List<Product> products) {
        for (Product product : products) {
            System.out.println("Device: " + product.getDeviceType() +
                    "\nBrand: " + product.getBrand() +
                    "\nModel: " + product.getModel() +
                    "\nDescription: " + product.getDescription() +
                    "\nDisplay: " + product.getDisplay() +
                    "\nStorage: " + product.getStorage() +
                    "\nPurchase price: " + product.getPurchasePrice() +
                    "\nSale price: " + product.getSalePrice() +
                    "\nID: " + product.getId() +
                    "\n \n");
        }
    }
}