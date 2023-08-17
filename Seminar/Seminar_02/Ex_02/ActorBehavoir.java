package Seminar.Seminar_02.Ex_02;

import java.util.HashMap;

import Seminar.Seminar_01.Product;

public interface ActorBehavoir {
    void setMake_order(boolean b);

    void setTake_order(boolean d);

    boolean getMade_order();

    boolean getTook_order();

    Order<Product> makeOrder(HashMap<String, Integer> desiredList);
}
