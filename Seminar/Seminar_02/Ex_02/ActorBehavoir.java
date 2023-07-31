package Seminar.Seminar_02.Ex_02;

import java.util.HashMap;

public interface ActorBehavoir {
    void setMake_order(boolean b);

    void setTake_order(boolean d);

    boolean getMade_order();

    boolean getTook_order();

    Order makeOrder(HashMap<String, Integer> desiredList);
}
