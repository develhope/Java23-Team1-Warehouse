import products.Product;

import java.util.Objects;

public class FilterByDevice implements ProductFilter {

    private final String input;

    public FilterByDevice (String input) {
        this.input = input.toUpperCase();
    }

    @Override
    public boolean isInFilter(Product product) {
        return Objects.equals(input, String.valueOf(product.getDeviceType()));
    }
}
