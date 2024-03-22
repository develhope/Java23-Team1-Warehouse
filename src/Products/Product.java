package Products;

public class Product {
    private Devices deviceType;
    private String brand;
    private String model;
    private String description;
    private float display;
    private float storage;
    private float purchasePrice;
    private float salePrice;
    private int id;

    public Product(Devices deviceType, String brand, String model, String description, float display, float storage,
                   float purchasePrice, float salePrice, int id) {
        this.deviceType = deviceType;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.display = display;
        this.storage = storage;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.id = id;
    }

    public Devices getDeviceType() {
        return deviceType;
    }
    public void setDeviceType(Devices deviceType) {
        this.deviceType = deviceType;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getDisplay() {
        return display;
    }
    public void setDisplay(float display) {
        this.display = display;
    }
    public float getStorage() {
        return storage;
    }
    public void setStorage(float storage) {
        this.storage = storage;
    }
    public float getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public float getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Product{" +
                "deviceType=" + deviceType +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", display=" + display +
                ", storage=" + storage +
                ", purchasePrice=" + purchasePrice +
                ", salePrice=" + salePrice +
                ", id=" + id +
                '}';
    }
}