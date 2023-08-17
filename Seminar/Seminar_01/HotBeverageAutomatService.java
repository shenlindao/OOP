package Seminar.Seminar_01;

import java.util.ArrayList;

public class HotBeverageAutomatService implements Service<HotBeverageAutomat, Product> {

    @Override
    public HotBeverageAutomat restock(HotBeverageAutomat HBautomat, Product product) {
        Product addProduct = HBautomat.getProduct(product.getName());
        ArrayList<Product> listProduct = HBautomat.getListProduct();
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
          } else {
            listProduct.add(product);
          }
          HBautomat.initProduct(listProduct);
          return HBautomat;
    }
    
}
