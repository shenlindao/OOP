package Seminar.Seminar_02.Ex_02;

import java.util.ArrayList;
import Seminar.Seminar_01.Automat;
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

    public void setNearestAutomat(Automat automat) {
        this.nearestAutomat = automat;
    }

    @Override
    public Order makeOrder(ArrayList<String> desiredList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : desiredList) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct);
            if (shoppingProduct != null) {
                shoppingList.add(shoppingProduct);
            }
        }
        setMake_order(true);
        return nearestAutomat.createOrder(shoppingList, this);
    }

    @Override
    public String toString() {
        return getName();
    }
}
