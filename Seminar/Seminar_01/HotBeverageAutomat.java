package Seminar.Seminar_01;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {

    List<HotBeverage> listHotBeverage = new ArrayList<>();

    public void initHotBeverage(List<HotBeverage> myHotList) {
        listHotBeverage = myHotList;
    }

    public HotBeverage getProduct(String name, double volume, int temperature) {
        for (HotBeverage el : listHotBeverage) {
            if ((el.getName().equals(name))
                    && (el.getVolume() == volume)
                    && (el.getTemperature() == temperature)) {
                return el;
            }
        }
        return null;
    }
}
