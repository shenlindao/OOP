package Seminar.Seminar_01;

// SRP, OCP
public class BeverageComparator extends ProductComparator {

    public int compare(Beverage o1, Beverage o2) {
        Double result = o1.getVolume() - o2.getVolume();
        return result.intValue();
    }
}
