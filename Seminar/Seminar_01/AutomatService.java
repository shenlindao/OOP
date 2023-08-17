package Seminar.Seminar_01;

import java.util.ArrayList;

public class AutomatService implements Service<Automat, Product> {

    @Override
    public Automat restock(Automat automat, Product product) {
        Product addProduct = automat.getProduct(product.getName());
        ArrayList<Product> listProduct = automat.getListProduct();
        if (addProduct != null) {
            addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
          } else {
            listProduct.add(product);
          }
          automat.initProduct(listProduct);
          return automat;     
    }
    
}
