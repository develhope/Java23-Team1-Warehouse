import java.util.*;

import products.Devices;
import products.Product;

abstract class ResearchMethod {

    private Warehouse warehouse;

    private Scanner scanner;

    public ResearchMethod(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public static void searchByType(List<Product> stockDevices, String typeResearch) {
        List<Product> matchingDevices = new ArrayList<Product>();
        Devices researchTypeEnum = Devices.valueOf(typeResearch.toUpperCase());
        if (stockDevices.isEmpty()) {
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

    public static void printDevices(List<Product> products) {
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