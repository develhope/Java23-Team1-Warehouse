import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import products.Devices;
import products.Product;


public class Cart {
    private List<Product> devices;

    public Cart() {
        this.devices = new ArrayList<>();
    }

    //metodo geralizzato che verifica prima se si può finalizzare la vendita
    // e poi procede svuotando il carrello e rimuovendo i device venduti dal magazzino;

//    public static void finalizeSellingProcess(boolean paymentCheck, Warehouse warehouse, Cart cart) {
//        if (paymentCheck) {
//            warehouse.getProductsInStock().removeAll(cart.getProductsInCart());
//            cart.getProductsInCart().clear();
//        } else {
//            System.out.println("you must first complete a form of payment");
//        }
//    }


    public List<Product> getDevices() {
        return devices;
    }

    public void addProductInCart(Product product) {
        devices.add(product);
    }

    public void setProductsInCart(List<Product> productsInCart) {
        this.devices = productsInCart;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : devices) {
            totalPrice += product.getSalePrice();
        }
        return totalPrice;
    }

    // RIMOZIONE DI UN ELEMENTO DAL CARRELLO TRAMITE ID
    // public List<Product> removeProductsInWarehouseByI(int id) {
    //     for (Product device : devices){
    //         if(device.getId() == id){
    //             devices.remove(device);
    //         }
    //     }
    //     return devices;
    // }
     public boolean removeProductsInWarehouseById(int id) {
         boolean updateCart = false;
         Iterator<Product> iterator = devices.iterator();

         while(iterator.hasNext()) {
             Product devices = iterator.next();
             
             if(devices.getId() == id) {
                 iterator.remove();
                 updateCart = true;
                 break;
             }
         }
         return updateCart;
     }

    @Override
    public String toString() {
        return "Cart{" +
                "productsInCart=" + devices +
                '}';
    }
}
