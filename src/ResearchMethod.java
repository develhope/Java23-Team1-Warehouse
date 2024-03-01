import products.Product;

import java.util.Iterator;
import java.util.List;

abstract class ResearchMethod {
    void searchByType (){};
    void printDevices (List<Product> productDaDefinire) {
        Iterator<Product> iterator = productDaDefinire.iterator();
        while (iterator.hasNext()) {
            if ()
            System.out.println(iterator.next());
        }
    };
}
