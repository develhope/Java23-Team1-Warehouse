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
    public void searchBySalePrice(float minPrice, float maxPrice) {
        if (warehouse.getProductsInStock().isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
            return;
        }

        if (minPrice > maxPrice) {
            System.out.println("Minimum price cannot be higher than maximum price!");
            return;
        }

        List<Product> matchingDevices = new ArrayList<>();
        for (Product product : warehouse.getProductsInStock()) {
            float salePrice = product.getSalePrice();
            if (salePrice >= minPrice && salePrice <= maxPrice) {
                matchingDevices.add(product);
            }
        }

        if (matchingDevices.isEmpty()) {
            System.out.println("No products found within the specified price range.");
        } else {
            printDevices(matchingDevices);
        }
    }
}