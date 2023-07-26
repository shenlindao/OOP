package Seminar.Seminar_01;

import java.util.ArrayList;

public class HotBeverageAutomat extends Automat {

    public HotBeverageAutomat() {
        super();
    }

    @Override
    public void initProduct(ArrayList<Product> myList) {
        super.initProduct(myList);
    }

    public HotBeverage getProduct(String name, double volume, Integer temperature) {
        for (Product el : listProduct) {
            if (el instanceof Product & el.getName().equals(name)
                    && ((HotBeverage) el).getTemperature() == temperature
                    && ((HotBeverage) el).getVolume() == volume) {
                return (HotBeverage) el;
            }
        }
        return null;
    }
}
