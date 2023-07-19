package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 1.6, 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0));
    Product product2 = new Food("Mars", 1.8, 90, 50, new GregorianCalendar(2023, 10, 19, 0, 0));
    Product product3 = new Food("Snicers", 2.5, 60, 15, new GregorianCalendar(2023, 10, 29, 0, 0));
    Product product4 = new Beverage("Coca-cola", 0.3, 100, 9, new GregorianCalendar(2023, 11, 05, 0, 0));
    Product product5 = new Beverage("Fanta", 0.5, 110, 5, new GregorianCalendar(2023, 12, 07, 0, 0));
    Product product6 = new HotBeverage("Coffee", 0.4, 200, 90, 20, new GregorianCalendar(2023, 8, 01, 0, 0));
    Product product7 = new HotBeverage("Tea", 1.2, 85, 500, 1, new GregorianCalendar(2023, 8, 01, 0, 0));
    

    Automat list = new Automat();
    List<Product> myList = new ArrayList<>();
    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    myList.add(product4);
    myList.add(product5);
    myList.add(product6);
    myList.add(product7);
    list.initProduct(myList);

    String name = "Coca-cola";
    System.out.println(list.getProduct(name).toString());

    name = "Mars";
    System.out.println(list.getProduct(name).toString());

    name = "Coffee";
    System.out.println(list.getProduct(name).toString());

    name = "Tea";
    System.out.println(list.getProduct(name).toString());

  }
}
