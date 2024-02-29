import java.util.Arrays;

public class Warehouse {
    private Product[] stock;
    private int emptySpace;

    public Warehouse(int maxProducts) {
        this.stock = new Product[maxProducts];
        this.emptySpace = 0;

    }

    public void addToStock(Product product) {
        stock[emptySpace] = product;
        emptySpace++;
    }

    public Product[] getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "stock=" + Arrays.toString(stock) +
                ", emptySpace=" + emptySpace +
                '}';
    }
}
