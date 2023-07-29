package Seminar.Seminar_01;

import java.util.GregorianCalendar;

public class Food extends Product {

  private double weight;

  public Food(String name, double weight, int price, int quantity, GregorianCalendar bestBefore) {
    super(name, price, quantity, bestBefore);
    this.weight = weight;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "\nname: " + getName()
        + "\nweight: " + getWeight()
        + "\nprice: " + getPrice()
        + "\nquantity: " + getQuantity()
        + "\nbestBefore: " + getBestBefore().get(GregorianCalendar.YEAR) + "/"
        + getBestBefore().get(GregorianCalendar.MONTH) + "/"
        + getBestBefore().get(GregorianCalendar.DATE) + "\n";
  }
}
