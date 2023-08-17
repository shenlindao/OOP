package Seminar.Seminar_01;

import java.util.GregorianCalendar;

// SRP, OCP
public abstract class Product {

  private String name;
  private int price;
  private int quantity;
  private GregorianCalendar bestBefore;

  public Product(String name, int price, int quantity, GregorianCalendar bestBefore) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.bestBefore = bestBefore;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public GregorianCalendar getBestBefore() {
    return bestBefore;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setBestBefore(GregorianCalendar bestBefore) {
    this.bestBefore = bestBefore;
  }

  @Override
  public String toString() {
    return "\n\nname: " + getName()
        + "\nprice: " + getPrice()
        + "\nquantity: " + getQuantity()
        + "\nbestBefore: " + getBestBefore().get(GregorianCalendar.YEAR) + "/"
        + getBestBefore().get(GregorianCalendar.MONTH) + "/"
        + getBestBefore().get(GregorianCalendar.DATE) + "\n";
  }
}
