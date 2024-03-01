package products;

public class Notebook extends Product {

    public Notebook(Devices deviceType, String brand, String model, String description, float display, float storage,
                    float salePrice, float purchasePrice, int id) {
        super(deviceType, brand, model, description, display, storage, salePrice, purchasePrice, id);
    }
}