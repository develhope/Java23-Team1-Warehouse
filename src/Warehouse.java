import products.Product;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> productsInStock = new ArrayList<Product>();
    public void addProductToStock(Product product) {
        productsInStock.add(product);
    }

    public List<Product> getProductsInStock() {
        return productsInStock;
    }
}
