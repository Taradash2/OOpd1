package org.example;

public class BottleOfMilk extends Product{
    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfMilk(String brand, String name, double prise, int volume, int fat){
        super(brand, name, prise);
        this.volume = volume;
        this.fat = fat;

    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - volume: %d", brend, name, prise, volume);
    }

}
