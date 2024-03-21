import products.Devices;
import products.Product;

import java.util.Objects;

public class FilterByDevice implements ProductFilter {

    private final Devices deviceType;

    public FilterByDevice (Devices deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public boolean isInFilter(Product product) {
        return Objects.equals(deviceType, product.getDeviceType());
    }
}
