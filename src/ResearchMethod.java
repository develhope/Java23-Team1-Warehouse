import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import products.Devices;
import products.Product;

abstract class ResearchMethod {

    private Warehouse warehouse;

    private Scanner scanner;

    public ResearchMethod(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    void searchByType(List<Product> stockDevices, String typeResearch) {
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
}