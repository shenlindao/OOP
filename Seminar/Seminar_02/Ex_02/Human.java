package Seminar.Seminar_02.Ex_02;

import java.util.HashMap;
import java.util.Map;

import Seminar.Seminar_01.Automat;
import Seminar.Seminar_01.Product;

// SRP, OCP
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

    public void setNearestAutomat(Automat automat) {
        this.nearestAutomat = automat;
    }

    @Override
    public Order<Product> makeOrder(HashMap<String, Integer> desiredList) {
        HashMap<Product, Integer> shoppingList = new HashMap<>();
        Product product;
        int quantity;
        for (Map.Entry<String, Integer> el : desiredList.entrySet()) {
            product = nearestAutomat.getProduct(el.getKey());
            quantity = el.getValue();
            if (product != null) {
                shoppingList.put(product, quantity);
            }
            System.out.println(shoppingList);
        }
        
        setMake_order(true);
        HashMap<Product, Integer> orderList = nearestAutomat.validateOrder(shoppingList);
        return nearestAutomat.createOrder(orderList, this);
    }

    @Override
    public String toString() {
        return getName();
    }
}
