package Seminar.Seminar_02.Ex_02;

import java.util.HashMap;

import Seminar.Seminar_01.Product;

public class Order {

    private HashMap<Product, Integer> products;
    private Human human;
    private int cost;

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
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
                + "\n\ncustomer name: " + human.getName()
                + "\n\nproducts: \n" + getProducts()
                + "\n\npurchase sum: " + getCost() + "\n";
    }

}