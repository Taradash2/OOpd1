package org.example;

public class BottleOfWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String name, double prise, int volume){
        super(name, prise);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - volume: %d", brend, name, prise, volume);
    }
}
