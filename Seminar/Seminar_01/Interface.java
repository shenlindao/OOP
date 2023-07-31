package Seminar.Seminar_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Interface {
    public static void mainMenu(ArrayList<Product> productList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("AUTOMAT");
        System.out.println();
        System.out.println("Select the number");
        System.out.println("1 - show all products");
        System.out.println("2 - create order");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                showAllProducts(productList, scanner);
                break;
            case 2:
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void showAllProducts(ArrayList<Product> productList, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("PRODUCT LIST\n");
        System.out.println("Show products with filter");
        System.out.println("1 - by name");
        System.out.println("2 - by weight");
        System.out.println("3 - by volume");
        System.out.println("4 - by temperature");
        System.out.println("5 - return to main menu");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                filterByName(productList);
                break;
            case 2:
                filterByWeight(productList);
                break;
            case 3:
                filterByVolume(productList);
                break;
            case 4:
                filterByTemperature(productList);
                break;
            case 5:
                mainMenu(productList, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void filterByName(ArrayList<Product> productList, Scanner scanner) {
        Comparator<Product> productComparator = new ProductComparator();
        productList.sort(productComparator);
        System.out.println("PRODUCT LIST fitred by name\n\n");
        System.out.println(productList);
        System.out.println("1 - create order");
        System.out.println("2 - return to main menu");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                orderCreating();
                break;
            case 2:
                mainMenu(productList, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void filterByWeight(ArrayList<Product> productList) {
        Comparator<Product> foodComparator = new FoodComparator();
        productList.sort(foodComparator);
        System.out.println("PRODUCT LIST fitred by weight\n\n");
        System.out.println(productList);
    }

    public static void filterByVolume(ArrayList<Product> productList) {
        Comparator<Product> beverageComparator = new BeverageComparator();
        productList.sort(beverageComparator);
        System.out.println("PRODUCT LIST fitred by volume\n\n");
        System.out.println(productList);
    }

    public static void filterByTemperature(ArrayList<Product> productList) {
        Comparator<Product> hotBeverageComparator = new HotBeverageComparator();
        productList.sort(hotBeverageComparator.reversed());
        System.out.println("PRODUCT LIST fitred by temperature\n\n");
        System.out.println(productList);
    }

    public static void orderCreating() {
        // Human human = new Human("Ivan", false, false, 500);
        // human.setNearestAutomat(automat);

        // HashMap<String, Integer> desiredProducts = new HashMap<>();
        // desiredProducts.put("Twix", 2);
        // desiredProducts.put("Coca-Cola", 5);
        // desiredProducts.put("Fanta", 3);
        // desiredProducts.put("Tea", 10);
        // System.out.println(desiredProducts);

        // Order order = Ivan.makeOrder(desiredProducts);
        // System.out.println(order);
    }
}