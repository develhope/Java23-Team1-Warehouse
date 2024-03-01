package products;

public class Smartphone extends Product {

    public Smartphone(Devices deviceType, String brand, String model, String description, float display, float storage,
                      float salePrice, float purchasePrice, int id) {
        super(deviceType, brand, model, description, display, storage, salePrice, purchasePrice, id);
    }
}
