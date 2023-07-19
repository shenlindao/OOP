// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.List;

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

}
