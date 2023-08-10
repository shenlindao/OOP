package Seminar.Seminar_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    Scanner scanner = new Scanner(System.in);

    Food product1 = new Food("Twix", 1.6, 880, 0, new GregorianCalendar(2023, 10, 10));
    Food product2 = new Food("Mars", 2.5, 90, 0, new GregorianCalendar(2023, 10, 19));
    Food product3 = new Food("Snicers", 2.9, 60, 15, new GregorianCalendar(2023, 10, 29));
    Beverage product4 = new Beverage("Coca-Cola", 0.3, 100, 1, new GregorianCalendar(2023, 11, 5));
    Beverage product5 = new Beverage("Fanta", 0.5, 110, 5, new GregorianCalendar(2023, 12, 7));
    HotBeverage product6 = new HotBeverage("Coffee", 0.4, 90, 200, 20, new GregorianCalendar(2023, 8, 14));
    HotBeverage product7 = new HotBeverage("Tea", 1.2, 85, 500, 100, new GregorianCalendar(2023, 8, 18));

    Automat automat = new Automat();
    ArrayList<Product> productList = new ArrayList<>();

    productList.add(product1);
    productList.add(product2);
    productList.add(product3);
    productList.add(product4);
    productList.add(product5);
    productList.add(product6);
    productList.add(product7);
    automat.initProduct(productList);

    try {
      Interface.mainMenu(productList, automat, scanner);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
