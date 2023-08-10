package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Seminar.Seminar_02.Ex_02.Order;
import Seminar.Seminar_02.Ex_02.Human;

public class Automat {

  ArrayList<Product> listProduct = new ArrayList<>();

  public ArrayList<Product> getListProduct() {
    return listProduct;
  }

  public void setListProduct(ArrayList<Product> listProduct) {
    this.listProduct = listProduct;
  }

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

  public HashMap<Product, Integer> validateOrder(HashMap<Product, Integer> shoppingList) {
    HashMap<Product, Integer> orderList = new HashMap<>();
    Iterator<Map.Entry<Product, Integer>> iterator = shoppingList.entrySet().iterator();
    iterator.hasNext();
    while (iterator.hasNext()) {
      Map.Entry<Product, Integer> el = iterator.next();
      Product prod = el.getKey();
      Integer amount = el.getValue();
      if (amount <= getProduct(prod.getName()).getQuantity()) {
        orderList.put(prod, amount);
      }
    }
    return orderList;
  }

  public Order<Product> createOrder(HashMap<Product, Integer> orderList, Human human) {
    Order<Product> order = new Order<Product>();
    int sum = 0;
    Iterator<Map.Entry<Product, Integer>> iterator = orderList.entrySet().iterator();
    iterator.hasNext();
    while (iterator.hasNext()) {
      Map.Entry<Product, Integer> el = iterator.next();
      Product prod = el.getKey();
      Integer amount = el.getValue();
      if (getProduct(prod.getName()).getQuantity() > 0) {
        sum = sum + ((getProduct(prod.getName()).getPrice()) * amount);
      } else {
        iterator.remove();
      }
    }
    order.setCost(sum);
    order.setProducts(orderList);
    order.setMan(human);
    return order;
  }
}
