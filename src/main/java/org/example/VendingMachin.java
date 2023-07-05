package org.example;

import java.util.List;

public class VendingMachin {

    private final List<Product> products;

    public VendingMachin(List<Product> products) {
        this.products = products;

    }

    public Product getBottleOfWatter(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName() == name && ((BottleOfWater) product).getVolume() == volume) {
                    return(BottleOfWater) product;
                }
            }
        }
        return null;
    }
//TODO: Самостоятельно разроботать метод получения бутылки с молоком

}
