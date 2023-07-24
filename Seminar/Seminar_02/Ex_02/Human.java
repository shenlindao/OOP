package Seminar.Seminar_02.Ex_02;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import Seminar.Seminar_01.Automat;
import Seminar.Seminar_01.Beverage;
import Seminar.Seminar_01.Food;
import Seminar.Seminar_01.HotBeverage;
import Seminar.Seminar_01.Product;

public class Human extends Actor {

    private double money;
    private Automat nearestAutomat;

    public Human(String name, boolean make_order, boolean take_order, double money) {
        super(name, make_order, take_order);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void setMake_order(boolean b) {

    }

    @Override
    public void setTake_order(boolean d) {

    }

    @Override
    public boolean getMade_order() {
        return false;
    }

    @Override
    public boolean getTook_order() {
        return false;
    }

    public void findNearestAutomat() {
        List<Product> myList = new ArrayList<>();

        Product product1 = new Food("Twix", 1.6, 80, 1, new GregorianCalendar(2023, 10, 10, 0, 0));
        Product product2 = new Food("Mars", 1.8, 90, 0, new GregorianCalendar(2023, 10, 19, 0, 0));
        Product product3 = new Food("Snicers", 2.5, 60, 0, new GregorianCalendar(2023, 10, 29, 0, 0));
        Product product4 = new Beverage("Coca-Cola", 0.3, 100, 0, new GregorianCalendar(2023, 11, 05, 0, 0));
        Product product5 = new Beverage("Fanta", 0.5, 110, 0, new GregorianCalendar(2023, 12, 07, 0, 0));
        Product product6 = new HotBeverage("Coffee", 0.4, 90, 200, 0, new GregorianCalendar(2023, 8, 01, 0, 0));
        Product product7 = new HotBeverage("Tea", 1.2, 85, 500, 0, new GregorianCalendar(2023, 8, 01, 0, 0));
        
        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);
        myList.add(product6);
        myList.add(product7);

        Automat automat = new Automat();
        automat.initProduct(myList);
        this.nearestAutomat = automat;
    }

    @Override
    public Order makeOrder(List<String> deList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : deList) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct);
            if (shoppingProduct != null) {
                shoppingList.add(shoppingProduct);
            }
        }
        setMake_order(true);
        return nearestAutomat.createOrder(shoppingList);
    }
}
