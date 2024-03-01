import java.util.ArrayList;
import java.util.Arrays;
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
<<<<<<< HEAD
// solo per addare
=======


>>>>>>> e3989f4103fc1cae177e58cdc6e0464198a61fd5
