package Seminar.Seminar_01;

public class HotBeverageComparator extends ProductComparator {

    public int compare(HotBeverage o1, HotBeverage o2) {
        Integer result = o1.getTemperature() - o2.getTemperature();
        return result.intValue();
    }
}