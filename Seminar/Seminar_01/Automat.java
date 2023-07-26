package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.Iterator;

import Seminar.Seminar_02.Ex_02.Order;
import Seminar.Seminar_02.Ex_02.Human;

public class Automat {

  ArrayList<Product> listProduct = new ArrayList<>();

  public void initProduct(ArrayList<Product> myList) {
    listProduct = myList;
  }

  public Product getProduct(String name) {
    for (Product el : listProduct) {
      if (el.getName().equals(name)) {
        return el;
      }
    }
    return null;
  }

  public Order createOrder(ArrayList<Product> shoppingList, Human human) {
    int sum = 0;
    Iterator<Product> iterator = shoppingList.iterator();
    while (iterator.hasNext()) {
      Product el = iterator.next();
      if (getProduct(el.getName()).getQuantity() > 0) {
        sum += getProduct(el.getName()).getPrice();
      } else {
        iterator.remove();
      }
    }
    Order order = new Order();
    order.setCost(sum);
    order.setProducts(shoppingList);
    order.setMan(human);
    return order;
  }
}
