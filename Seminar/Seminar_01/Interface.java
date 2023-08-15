package Seminar.Seminar_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Seminar.Seminar_02.Ex_02.Human;
import Seminar.Seminar_02.Ex_02.Order;

public class Interface {
    public static void mainMenu(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("AUTOMAT");
        System.out.println();
        System.out.println("Select the number");
        System.out.println("1 - show all products");
        System.out.println("2 - create order");
        System.out.println("3 - add products");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                showAllProducts(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 2:
                orderCreating(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 3:
                addProducts(productList, HBproductList, automat, HBautomat, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void addProducts(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("ADD PRODUCTS\n");
        System.out.println("Choose type of product");
        System.out.println("Select the number");
        System.out.println("1 - food");
        System.out.println("2 - beverage");
        System.out.println("3 - hot beverage");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                addFood(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 2:
                addBeverage(productList, automat, scanner);
                break;
            case 3:
                addHotBeverage(HBproductList, HBautomat, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    private static void addFood(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("ADDING FOOD\n");
        System.out.println("Input the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Input weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Input quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Input price: ");
        int price = scanner.nextInt();
        System.out.println("The best before date");
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input dayOfMonth: ");
        int dayOfMonth = scanner.nextInt();
        GregorianCalendar bestBefore = new GregorianCalendar(year, month, dayOfMonth);
        Product newProduct = new Food(name, weight, price, quantity, bestBefore);
        AutomatService service = new AutomatService();
        service.restock(automat, newProduct);
        // System.out.println(productList);
        // System.out.println("1 - return to main menu");
        // System.out.println("else key - exit program");
        // System.out.println();
        // int menuChoise = Integer.parseInt(scanner.nextLine());
        // switch (menuChoise) {
        //     case 1:
        //         mainMenu(productList, HBproductList, automat, HBautomat, scanner);
        //         break;
        //     default:
        //         break;
        // }
        partOfMenu(productList, HBproductList, automat, HBautomat, scanner);
    }

    private static void addBeverage(ArrayList<Product> productList, Automat automat, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("ADDING BEVERAGE\n");
        System.out.println("Input the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Input volume: ");
        double volume = scanner.nextDouble();
        System.out.println("Input quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Input price: ");
        int price = scanner.nextInt();
        System.out.println("The best before date");
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input dayOfMonth: ");
        int dayOfMonth = scanner.nextInt();
        GregorianCalendar bestBefore = new GregorianCalendar(year, month, dayOfMonth);
        Product newProduct = new Beverage(name, volume, price, quantity, bestBefore);
        AutomatService service = new AutomatService();
        service.restock(automat, newProduct);
    }

    private static void addHotBeverage(ArrayList<Product> HBproductList, HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        System.out.println("ADDING HOT BEVERAGE\n");
        System.out.println("Input the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Input volume: ");
        double volume = scanner.nextDouble();
        System.out.println("Input temperature: ");
        int temperature = scanner.nextInt();
        System.out.println("Input quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Input price: ");
        int price = scanner.nextInt();
        System.out.println("The best before date");
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input dayOfMonth: ");
        int dayOfMonth = scanner.nextInt();
        GregorianCalendar bestBefore = new GregorianCalendar(year, month, dayOfMonth);
        Product newProduct = new HotBeverage(name, volume, temperature, price, quantity, bestBefore);
        AutomatService service = new AutomatService();
        service.restock(HBautomat, newProduct);
        System.out.println(HBproductList);
    }

    public static void showAllProducts(ArrayList<Product> productList, ArrayList<Product> HBproductList,
            Automat automat, HotBeverageAutomat HBautomat, Scanner scanner)
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
                filterByName(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 2:
                filterByWeight(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 3:
                filterByVolume(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 4:
                filterByTemperature(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 5:
                mainMenu(productList, HBproductList, automat, HBautomat, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    private static void partOfMenu(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        System.out.println(productList);
        System.out.println("\n1 - create order");
        System.out.println("2 - return to main menu");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                orderCreating(productList, HBproductList, automat, HBautomat, scanner);
                break;
            case 2:
                mainMenu(productList, HBproductList, automat, HBautomat, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void filterByName(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        Comparator<Product> productComparator = new ProductComparator();
        productList.sort(productComparator);
        System.out.println("PRODUCT LIST fitred by name\n\n");
        partOfMenu(productList, HBproductList, automat, HBautomat, scanner);
    }

    public static void filterByWeight(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        Comparator<Product> foodComparator = new FoodComparator();
        productList.sort(foodComparator);
        System.out.println("PRODUCT LIST fitred by weight\n\n");
        partOfMenu(productList, HBproductList, automat, HBautomat, scanner);
    }

    public static void filterByVolume(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        Comparator<Product> beverageComparator = new BeverageComparator();
        productList.sort(beverageComparator);
        System.out.println("PRODUCT LIST fitred by volume\n\n");
        partOfMenu(productList, HBproductList, automat, HBautomat, scanner);
    }

    public static void filterByTemperature(ArrayList<Product> productList, ArrayList<Product> HBproductList,
            Automat automat, HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        Comparator<Product> hotBeverageComparator = new HotBeverageComparator();
        productList.sort(hotBeverageComparator.reversed());
        System.out.println("PRODUCT LIST fitred by temperature\n\n");
        partOfMenu(productList, HBproductList, automat, HBautomat, scanner);
    }

    public static void orderCreating(ArrayList<Product> productList, ArrayList<Product> HBproductList, Automat automat,
            HotBeverageAutomat HBautomat, Scanner scanner)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Input your name: ");
        String name = scanner.nextLine();
        Human human = new Human(name, false, false, 1000);
        HashMap<String, Integer> desiredProducts = new HashMap<>();
        System.out.println("\nChose a product: ");
        int i = 0;
        for (Product product : productList) {
            i++;
            System.out.println(i + " - " + product.getName() + " (" + product.getQuantity() + " pieces)");
        }
        for (Product product : HBproductList) {
            i++;
            System.out.println(i + " - " + product.getName() + " (" + product.getQuantity() + " pieces)");
        }
        System.out.println("\nSelect the number of product: ");
        int choiseNumer = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the quantity you need: ");
        int choiseAmount = Integer.parseInt(scanner.nextLine());
        int j = 0;
        for (Product product : productList) {
            j++;
            if (choiseNumer == j) {
                String choiseName = product.getName();
                desiredProducts.put(choiseName, choiseAmount);
            }
        }
        for (Product product : HBproductList) {
            j++;
            if (choiseNumer == j) {
                String choiseName = product.getName();
                desiredProducts.put(choiseName, choiseAmount);
            }
        }
        makeDesireList(productList, HBproductList, desiredProducts, automat, scanner);

        human.setNearestAutomat(automat);
        Order<Product> order = human.makeOrder(desiredProducts);
        human.setNearestAutomat(HBautomat);
        Order<Product> HBorder = human.makeOrder(desiredProducts);
        System.out.println(order);
        System.out.println(HBorder);
    }

    private static void makeDesireList(ArrayList<Product> productList, ArrayList<Product> HBproductList,
            HashMap<String, Integer> desiredProducts,
            Automat automat, Scanner scanner)
            throws IOException, InterruptedException {
        System.out.println("\nYour wish list:");
        System.out.println(desiredProducts + "\n");
        System.out.println("\nDo you want something else?");
        System.out.println("1 - yes");
        System.out.println("2 - make order");
        System.out.println("else key - exit program");
        int menuChoise = Integer.parseInt(scanner.nextLine());
        switch (menuChoise) {
            case 1:
                System.out.println("\nSelect the number of product: ");
                int choiseNumer = Integer.parseInt(scanner.nextLine());
                System.out.println("Input the quantity you need: ");
                int choiseAmount = Integer.parseInt(scanner.nextLine());
                int j = 0;
                for (Product product : productList) {
                    j++;
                    if (choiseNumer == j) {
                        String choiseName = product.getName();
                        for (Map.Entry<String, Integer> entry : desiredProducts.entrySet()) {
                            if (entry.getKey() == choiseName) {
                                String key = entry.getKey();
                                Integer val = entry.getValue() + choiseAmount;
                                desiredProducts.remove(key);
                                desiredProducts.put(key, val);
                            } else {
                                desiredProducts.put(choiseName, choiseAmount);
                            }
                        }
                    }
                }
                for (Product product : HBproductList) {
                    j++;
                    if (choiseNumer == j) {
                        String choiseName = product.getName();
                        for (Map.Entry<String, Integer> entry : desiredProducts.entrySet()) {
                            if (entry.getKey() == choiseName) {
                                String key = entry.getKey();
                                Integer val = entry.getValue() + choiseAmount;
                                desiredProducts.remove(key);
                                desiredProducts.put(key, val);
                            } else {
                                desiredProducts.put(choiseName, choiseAmount);
                            }
                        }
                    }
                }
                makeDesireList(productList, HBproductList, desiredProducts, automat, scanner);
                break;
            case 2:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                break;
            default:
                break;
        }
        scanner.close();
    }
}