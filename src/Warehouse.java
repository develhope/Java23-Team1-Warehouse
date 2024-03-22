import Filters.FilterByDevice;
import Products.Product;
import javax.swing.*;
import Filters.ProductFilter;
import Products.Devices;
import Products.Product;

import javax.naming.directory.InvalidSearchFilterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private List<Product> devices;

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
    public double calculateAveragePurchasePriceByDeviceType(Devices deviceType) {
        double totalPurchasePrice = 0.0;
        int numOfDevices = 0;

        FilterByDevice deviceFilter = new FilterByDevice(deviceType);

        for (Product product : devices) {
            try {
                if (deviceFilter.isInFilter(product)) {
                    totalPurchasePrice += product.getPurchasePrice();
                    numOfDevices++;
                }
            } catch (Exception e) {
                System.out.println("Errore nel filtro: " + e.getMessage());
            }
        }

        if (numOfDevices == 0) {
            System.out.println("Non ci sono dispositivi di tipo " + deviceType);
            return 0.0; // Ritorna 0 se non ci sono dispositivi del tipo specificato
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
