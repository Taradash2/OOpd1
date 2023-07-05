package org.example;

public class CokaCola extends Product {
    private int volume;
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public CokaCola(String name, double prise, int volume, int calories){
        super(name,prise);
        this.volume = volume;
        this.calories = calories;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - volume: %d - calories: %d", brend, name, prise, volume, calories);
    }
}


