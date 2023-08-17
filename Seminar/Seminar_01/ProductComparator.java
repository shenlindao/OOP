package Seminar.Seminar_01;

import java.util.Comparator;

// SRP, OCP
public class ProductComparator implements Comparator<Product> {

    public int compare(Product o1, Product o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }

    @Override
    public Comparator<Product> reversed() {
        return Comparator.super.reversed();
    }
}
