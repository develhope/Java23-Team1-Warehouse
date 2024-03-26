package Filters;

import Filters.ProductFilter;
import Products.Product;
import javax.naming.directory.InvalidSearchFilterException;
public class FilterBySalePrice implements ProductFilter {
    private final float minPrice;
    private final float maxPrice;
    FilterBySalePrice(float minPrice, float maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
    @Override
    public boolean isInFilter(Product product) throws InvalidSearchFilterException {
        if (minPrice > maxPrice) {
            throw new InvalidSearchFilterException("Minimum price can't be higher than maximum price");
        }
        return product.getSalePrice() < maxPrice && product.getSalePrice() > minPrice;
    }
}
