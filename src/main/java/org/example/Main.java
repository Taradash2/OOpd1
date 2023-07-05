package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
//        product1.name = "Botle of watter";
//        //product1.brend = "OOO";
//        product1.prise = 50;

        System.out.println(product1.displayInfo());

       Product product2 = new Product(product1.parapar4, product1.parara1);
       Product product3 = new Product("q", "s", -1000);

       product3.setPrise(20);


//       product3.name = "____";
//       product3.prise = -200;

        BottleOfWater bottleOfWater1 = new BottleOfWater("Fortoon",  50, 2);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("OOO", "Milk",  50, 2, 10);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);

        VendingMachin machin = new VendingMachin(products);











    }
}