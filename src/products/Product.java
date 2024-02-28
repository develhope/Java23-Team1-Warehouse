package products;

public abstract class Product {
    private String device;
    private String brand;
    private String model;
    private String description;
    private float display;
    private float storage;
    private float purchasePrice;
    private float salePrice;
    private float id;

    private Notebook[] notebooks;
    private Tablet[] tablets;
    private Smartphone[] smartphone;

    public Product(String device, String brand, String model, String description, float display, float storage,
            float purchasePrice, float salePrice, float id) {
        this.device = device;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.display = display;
        this.storage = storage;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
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

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public Notebook[] getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Notebook[] notebooks) {
        this.notebooks = notebooks;
    }

    public Tablet[] getTablets() {
        return tablets;
    }

    public void setTablets(Tablet[] tablets) {
        this.tablets = tablets;
    }

    public Smartphone[] getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone[] smartphone) {
        this.smartphone = smartphone;
    }
}