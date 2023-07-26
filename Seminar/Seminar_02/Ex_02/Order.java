package Seminar.Seminar_02.Ex_02;

import java.util.ArrayList;
import Seminar.Seminar_01.Product;

public class Order {
    private ArrayList<Product> products;
    private Human human;
    private int cost;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Human getMan() {
        return human;
    }

    public void setMan(Human human) {
        this.human = human;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ORDER"
                + "\ncustomer name: " + human.getName()
                + "\nproducts: \n" + getProducts()
                + "\npurchase sum: " + getCost();
    }

}