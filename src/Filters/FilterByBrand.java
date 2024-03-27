package Filters;

import Products.Product;
import java.util.Objects;

public class FilterByBrand implements ProductFilter {
    private String input;

    public FilterByBrand(String input) {
        this.input = input.toUpperCase();
    }

    @Override
    public boolean isInFilter(Product product) {
        return Objects.equals(input, product.getBrand().toLowerCase());
    }
}