package Filters;

import Products.Product;

import javax.naming.directory.InvalidSearchFilterException;

public class FilterById implements ProductFilter{

    private final int id;

    public FilterById(int id) {
        this.id = id;
    }

    @Override
    public boolean isInFilter(Product product) throws InvalidSearchFilterException {
        return product.getId() == id;
    }
}
