package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0));
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0));
    Product product3 = new Food("Snicers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0));

    Automat list = new Automat();
    List<Product> myList = new ArrayList<>();
    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    list.initProduct(myList);

    String name = "Twix";
    System.out.println(list.getProduct(name).toString());

  }
}
