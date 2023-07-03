package org.example;

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
        System.out.println(product3.displayInfo());
       System.out.println(product2.displayInfo());






    }
}