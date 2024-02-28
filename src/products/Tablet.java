package products;

public class Tablet extends Product {

    public Tablet(String device, String brand, String model, String description, float display, float storage,
            float salePrice, float purchasePrice, float id) {
        super(device, brand, model, description, display, storage, salePrice, purchasePrice, id);
        
        getDevice();
        getBrand();
        getModel();
        getDescription();
        getDisplay();
        getStorage();
        getSalePrice();
        getPurchasePrice();
        getId();
        setDevice(device);
        setBrand(brand);
        setModel(model);
        setDescription(description);
        setDisplay(display);
        setStorage(storage);
        setSalePrice(salePrice);
        setPurchasePrice(purchasePrice);
        setId(id);
    }
}
