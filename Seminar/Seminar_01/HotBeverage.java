package Seminar.Seminar_01;

import java.util.GregorianCalendar;

public class HotBeverage extends Beverage {

    private int temperature;

    public HotBeverage(String name, double volume, int temperature, int price, int quantity,
            GregorianCalendar bestBefore) {
        super(name, volume, price, quantity, bestBefore);
        this.temperature = temperature;
    }

    private int getTemperature() {
        return temperature;
    }

    private void setTemperature() {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "PRODUCT\n" + "name: " + getName() + "\nvolume: " + getVolume() +  "\ntemperature: " + temperature + "\nprice: " + getPrice() + "\nquantity: "
                + getQuantity() + "\nbestBefore: "
                + getBestBefore().get(GregorianCalendar.YEAR) + "/" + getBestBefore().get(GregorianCalendar.MONTH) + "/"
                + getBestBefore().get(GregorianCalendar.DATE) + "\n";
    }
}
