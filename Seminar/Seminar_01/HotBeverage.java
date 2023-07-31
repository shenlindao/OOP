package Seminar.Seminar_01;

import java.util.GregorianCalendar;

public class HotBeverage extends Beverage {

    private int temperature;

    public HotBeverage(String name, double volume, int temperature, int price, int quantity,
            GregorianCalendar bestBefore) {
        super(name, volume, price, quantity, bestBefore);
        this.temperature = temperature;
    }

    protected int getTemperature() {
        return temperature;
    }

    protected void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "\n\nname: " + getName()
                + "\nvolume: " + getVolume()
                + "\ntemperature: " + getTemperature()
                + "\nprice: " + getPrice()
                + "\nquantity: " + getQuantity()
                + "\nbestBefore: " + getBestBefore().get(GregorianCalendar.YEAR) + "/"
                + getBestBefore().get(GregorianCalendar.MONTH) + "/"
                + getBestBefore().get(GregorianCalendar.DATE) + "\n";
    }
}
