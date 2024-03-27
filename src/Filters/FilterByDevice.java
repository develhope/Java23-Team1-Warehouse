package Filters;

import Products.DeviceType;
import Products.Product;

import java.util.Objects;

public class FilterByDevice implements ProductFilter {

    private final DeviceType deviceType;

    public FilterByDevice (DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public boolean isInFilter(Product product) {
        return Objects.equals(deviceType, product.getDeviceType());
    }
}
