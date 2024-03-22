package Filters;

import Products.Product;

import javax.naming.directory.InvalidSearchFilterException;

public class FilterByPurchasePrice implements ProductFilter {

    private float minPrice;
    private float maxPrice;

    FilterByPurchasePrice(float minPrice, float maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isInFilter(Product product) throws InvalidSearchFilterException {
        if (minPrice > maxPrice) {
            throw new InvalidSearchFilterException("Minimum price can't be higher than maximum price");
        }
        return product.getPurchasePrice() < maxPrice && product.getPurchasePrice() > minPrice;
    }
}
