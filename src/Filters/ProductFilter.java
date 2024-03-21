package Filters;

import products.Product;

import javax.naming.directory.InvalidSearchFilterException;

public interface ProductFilter {
    boolean isInFilter(Product product) throws InvalidSearchFilterException;
}
