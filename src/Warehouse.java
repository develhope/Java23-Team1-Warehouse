import products.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Product> devices;


    public void finalizeSellingProcess(boolean paymentCheck, Cart cart) {
        devices.removeAll(cart.getDevices());
        cart.getDevices().clear();
    }

    //ho integrato la generazione di un id univoco per ogni prodotto quando viene aggiunto al magazzino che sovrascrive
    // l'ID generico dato alla creazione del prodotto con uno indicizzato da 1 in crescendo.
    public void addProductToStock(Product product) {
        product.setId(1);
        int id = product.getId();
        for (Product device : devices) {
            if (device.getId() >= id) {
                id = product.getId() + 1;
            }
            product.setId(id);
        }
        devices.add(product);
    }

    public Warehouse() {
        this.devices = new ArrayList<Product>();
    }

    public List<Product> getProductsInStock() {
        return devices;
    }

    public List<Product> filterByAttribute(String input, String typeResearched) {
        List<Product> matchingDevices = new ArrayList<>();
        String inputToLowerCase = input.toLowerCase();
        for (Product product : devices) {
            String researchToLowerCase = "";
            switch (typeResearched) {
                case "brand":
                    researchToLowerCase = product.getBrand().toLowerCase();
                    break;

                case "model":
                    researchToLowerCase = product.getModel().toLowerCase();
                    break;

                case "device":
                    researchToLowerCase = String.valueOf(product.getDeviceType()).toLowerCase();
                    break;

                default:
                    break;

            }
            if (inputToLowerCase.equals(researchToLowerCase)) {
                matchingDevices.add(product);
            }
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
