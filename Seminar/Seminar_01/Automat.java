// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.List;

import Seminar.Seminar_02.Ex_02.Order;

public class Automat {

  List<Product> listProduct = new ArrayList<>();

  public void initProduct(List<Product> myList) {
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

  public Order createOrder(List<Product> myList) {
    return null;
  }
}
