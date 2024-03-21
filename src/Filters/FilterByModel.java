package Filters;

import products.Product;

import java.util.Objects;

public class FilterByModel implements ProductFilter {
    private String input;

    public FilterByModel (String input) {
        this.input = input.toLowerCase();
    }

    @Override
    public boolean isInFilter(Product product) {
        return Objects.equals(input, product.getModel().toLowerCase());
    }
}
