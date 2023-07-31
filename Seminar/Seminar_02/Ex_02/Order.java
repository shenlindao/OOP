package Seminar.Seminar_02.Ex_02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        HashMap<String, Integer> listOfProducts = new HashMap<>();
        for (Map.Entry<Product, Integer> el : products.entrySet()) {
            String prod = el.getKey().getName();
            Integer amount = el.getValue();
            listOfProducts.put(prod, amount);
        };
        return "\nORDER"
                + "\n\ncustomer name:\n" + human.getName()
                + "\n\nproducts:\n" + listOfProducts
                + "\n\npurchase sum:\n" + getCost() + "\n";
    }

}