package Seminar.Seminar_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;
import Seminar.Seminar_01.Interface;
import Seminar.Seminar_02.Ex_02.Human;
import Seminar.Seminar_02.Ex_02.Order;
import Seminar.Seminar_03.Ex_01.StudentNameComparator;

public class Program {

  public static void main(String[] args) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    Scanner scanner = new Scanner(System.in);
    
    Product product1 = new Food("Twix", 1.6, 880, 0, new GregorianCalendar(2023, 10, 10));
    Product product2 = new Food("Mars", 2.5, 90, 0, new GregorianCalendar(2023, 10, 19));
    Product product3 = new Food("Snicers", 2.9, 60, 15, new GregorianCalendar(2023, 10, 29));
    Product product4 = new Beverage("Coca-Cola", 0.3, 100, 1, new GregorianCalendar(2023, 11, 5));
    Product product5 = new Beverage("Fanta", 0.5, 110, 5, new GregorianCalendar(2023, 12, 7));
    Product product6 = new HotBeverage("Coffee", 0.4, 90, 200, 20, new GregorianCalendar(2023, 8, 14));
    Product product7 = new HotBeverage("Tea", 1.2, 85, 500, 100, new GregorianCalendar(2023, 8, 18));

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
      Interface.mainMenu(productList, scanner);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    /*
     * String name;
     * double volume;
     * int temperature;
     * 
     * name = "Mars";
     * System.out.println(list.getProduct(name).toString());
     * 
     * name = "Twix";
     * System.out.println(list.getProduct(name).toString());
     * 
     * name = "Coca-Cola";
     * System.out.println(list.getProduct(name).toString());
     * 
     * name = "Fanta";
     * System.out.println(list.getProduct(name).toString());
     * 
     * name = "Coffee";
     * volume = 0.4;
     * temperature = 90;
     * System.out.println(list.getProduct(name, volume, temperature).toString());
     * 
     * name = "Tea";
     * volume = 1.2;
     * temperature = 85;
     * System.out.println(list.getProduct(name, volume, temperature).toString());
     * 
     */

    // Human Ivan = new Human("Ivan", false, false, 500);
    // Ivan.setNearestAutomat(automat);

    // HashMap<String, Integer> desiredProducts = new HashMap<>();
    // desiredProducts.put("Twix", 2);
    // desiredProducts.put("Coca-Cola", 5);
    // desiredProducts.put("Fanta", 3);
    // desiredProducts.put("Tea", 10);
    // System.out.println(desiredProducts);

    // Order order = Ivan.makeOrder(desiredProducts);
    // System.out.println(order);

    // Comparator<Product> productComparator = new ProductComparator();
    // productList.sort(productComparator);
    // System.out.println(productList);

    // Comparator<Product> foodComparator = new FoodComparator();
    // productList.sort(foodComparator);
    // System.out.println(productList);

    // Comparator<Product> beverageComparator = new BeverageComparator();
    // productList.sort(beverageComparator);
    // System.out.println(productList);

    // Comparator<Product> hotBeverageComparator = new HotBeverageComparator();
    // productList.sort(hotBeverageComparator.reversed());
    // System.out.println(productList);
  }
}
