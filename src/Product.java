public class Product {
    private String device;
    private String brand;
    private String model;
    private String description;
    private float display;
    private float storage;
    private float purchase;
    private float sale;
    private float id;

    public Product(String device, String brand, String model, String description, float display, float storage,
            float purchase, float sale, float id) {
        this.device = device;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.display = display;
        this.storage = storage;
        this.purchase = purchase;
        this.sale = sale;
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
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

    public float getPurchase() {
        return purchase;
    }

    public void setPurchase(float purchase) {
        this.purchase = purchase;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }
}