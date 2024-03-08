import products.Devices;
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
        String inputToLowerCase = input.toLowerCase();
        for (Product product : productsInStock) {
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
        for (Product product : productsInStock) {
            if (product.getSalePrice() <= maxPrice && product.getSalePrice() >= minPrice) {
                matchingDevices.add(product);
            }
        }
        return matchingDevices;
    }


}
