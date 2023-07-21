package Seminar.Seminar_02.Ex_02;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import Seminar.Seminar_01.Automat;
import Seminar.Seminar_01.Beverage;
import Seminar.Seminar_01.Food;
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
        Product product1 = new Food("Twix", 1.6, 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0));
        Product product2 = new Food("Mars", 1.8, 90, 50, new GregorianCalendar(2023, 10, 19, 0, 0));
        Product product3 = new Food("Snicers", 2.5, 60, 15, new GregorianCalendar(2023, 10, 29, 0, 0));
        Product product4 = new Beverage("Coca-Cola", 0.3, 100, 9, new GregorianCalendar(2023, 11, 05, 0, 0));
        Product product5 = new Beverage("Fanta", 0.5, 110, 5, new GregorianCalendar(2023, 12, 07, 0, 0));

        Automat automat = new Automat();
        automat.initProduct(null);
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
