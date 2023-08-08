package Seminar.Seminar_01;

public class FoodComparator extends ProductComparator {

    public int compare(Food o1, Food o2) {
        Double result = o1.getWeight() - o2.getWeight();
        return result.intValue();
    }
}
