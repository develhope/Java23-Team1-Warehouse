import Products.Devices;
import Products.Product;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @org.junit.jupiter.api.Test
    void removeByID() {
        Warehouse warehouse = new Warehouse();
        Product product = new Product(Devices.SMARTPHONE, "Apple", "Iphone 13 pro", "none", 5.2f, 512, 900, 1200, 0);
        warehouse.addProductToStock(product);
        warehouse.removeByID(1);
        warehouse.isEmpty();
        assertTrue(warehouse.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void search() {
    }

    @org.junit.jupiter.api.Test
    void finalizeSellingProcess() {
    }

    @org.junit.jupiter.api.Test
    void addProductToStock() {
    }

    @org.junit.jupiter.api.Test
    void setStockID() {
    }

    @org.junit.jupiter.api.Test
    void getProductsInStock() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void calculateAveragePurchasePriceByDeviceType() {
    }
}