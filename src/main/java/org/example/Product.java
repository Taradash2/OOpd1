package org.example;

public class Product {
    protected String name;
    protected String brend;
    protected double prise;

    int parara1;
    String parara2;
    boolean papaap3;
    String parapar4;


    {
        System.out.println("initializer");
        parara1 = 100;
        parara2 = "string";
        papaap3 = true;
        parapar4 = "second";


    }
    public double getPrise(){
        return prise;

    }

    public void setPrise(double prise) {
        if (prise <= 0)
        throw new RuntimeException("Incorect prise");
    else
        this.prise = prise;

    }

    public String getName() {
        return name;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setName(String name) {
        if(name.length() < 3)
            this.name = "Product";
        else
            this.name = name;
    }

    public Product(String name){
        this(name, 30);
      this.name = name;

    }

    public Product(String name, double prise){
        this("noneme", name,prise);

    }

    public Product(String brend, String name, double prise){
        System.out.println("Construct");
        if (brend.length() < 4)
            this.brend = "Brand";
        else
            this.brend = brend;
        if(name.length() < 3)
            this.name = "Product";
        else
            this.name = name;
        if (prise <= 0)
            this.prise = 1;
        else
            this.prise = prise;

    }

    public Product(){
        name = "Product";
        brend = "AAA";
        prise = 1;


    }

    String displayInfo(){
        return String.format("%s - %s - %f ", brend, name, prise);

    }
}
