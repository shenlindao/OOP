package Seminar.Seminar_01;

import java.util.GregorianCalendar;

public class Beverage extends Product {

  private double volume;

  public Beverage(String name, double volume, int price, int quantity, GregorianCalendar bestBefore) {
    super(name, price, quantity, bestBefore);
    this.volume = volume;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    return "PRODUCT\n" + "name: " + getName() + "\nvolume: " + volume + "\nprice: " + getPrice() + "\nquantity: " + getQuantity() + "\nbestBefore: "
        + getBestBefore().get(GregorianCalendar.YEAR) + "/" + getBestBefore().get(GregorianCalendar.MONTH) + "/" + getBestBefore().get(GregorianCalendar.DATE) + "\n";
  }
}
