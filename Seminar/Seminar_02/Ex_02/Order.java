package Seminar.Seminar_02.Ex_02;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import Seminar.Seminar_01.Automat;
import Seminar.Seminar_01.Product;

public class Order extends Automat {

    private ArrayList<Product> list;

    private Human human;

    private int price;
    private int quantity;

    public Order(int id, String name, int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ORDER"
            + "\ncustomer name: " + human.getName()
            + "\nprice: " + getPrice();
    }

}