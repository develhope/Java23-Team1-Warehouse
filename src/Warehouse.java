import Filters.FilterByDevice;
import Products.DeviceType;
import Products.Product;

import javax.swing.*;

import Filters.ProductFilter;
import Products.DeviceType;
import Products.Product;

import javax.naming.directory.InvalidSearchFilterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private List<Product> devices;

    public void removeByID(int id) {
        devices.removeIf(product -> product.getId() == id);
    }


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

    public void finalizeSellingProcess(boolean paymentCheck, Cart cart) {
        devices.removeAll(cart.getDevices());
        cart.getDevices().clear();
    }

    public void addProductToStock(Product product) {

        setStockID(product);
        devices.add(product);

    }

    public Warehouse() {
        this.devices = new ArrayList<Product>();
    }

    public void setStockID(Product product) {
        int id = 0;
        if (devices.isEmpty()) {
            product.setId(1);
        } else {

            for (Product device : devices) {
                if (device.getId() >= id) {
                    id = device.getId() + 1;
                }
                product.setId(id);
            }
        }

    }

    public List<Product> getProductsInStock() {
        return devices;
    }

    public boolean isEmpty() {
        return devices.isEmpty();
    }

    public double calculateAveragePurchasePriceByDeviceType(DeviceType deviceType) {
        double totalPurchasePrice = 0.0;
        int numOfDevices = 0;
        if (devices.isEmpty()) {
            throw new RuntimeException("Warehouse can't be empty");
        }
        FilterByDevice deviceFilter = new FilterByDevice(deviceType);


        for (Product product : devices) {
            if (deviceFilter.isInFilter(product)) {
                totalPurchasePrice += product.getPurchasePrice();
                numOfDevices++;
            }
        }
        if (numOfDevices == 0) {
            System.out.println("there aren't devices of kind: " + deviceType);
            return 0.0;
        }

        return totalPurchasePrice / numOfDevices;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "devices=" + devices +
                '}';
    }
}
