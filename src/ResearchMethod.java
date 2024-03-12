import java.util.*;

import products.Devices;
import products.Product;

public class ResearchMethod {

    private final Warehouse warehouse;

    public ResearchMethod(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<Product> searchByType(String input) {
        if (warehouse.isEmpty()) {
            System.out.println("No available devices");
        }
        List<Product> matchingDevices = warehouse.filterByAttribute(input, "device");
        return matchingDevices;
    }

    public List<Product> searchByPriceRange(String minPrice, String maxPrice) {
        if (warehouse.isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
        }
        int minPriceResearched = Integer.parseInt(minPrice);
        int maxPriceResearched = Integer.parseInt(maxPrice);
        if (minPriceResearched > maxPriceResearched) {
            System.out.println("Minimum price can't be higher that maximum price!");
        }
        List<Product> matchingDevices = warehouse.filterBySaleRange(minPriceResearched, maxPriceResearched);
        return matchingDevices;
    }

    public void searchByBrand(String input) {
        if (warehouse.isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
        }
        List<Product> matchingDevices = new ArrayList<Product>();
        matchingDevices = warehouse.filterByAttribute(input, "brand");
        printDevices(matchingDevices);
    }

    public List<Product> searchByModel(String input) {
        if (warehouse.isEmpty()) {
            System.out.println("The warehouse is currently out of stock!");
        }
        List<Product> matchingDevices = new ArrayList<Product>();
        matchingDevices = warehouse.filterByAttribute(input, "model");
        return matchingDevices;
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