package Seminar.Seminar_02.Ex_01;

public class Chicken extends Bird implements Swimable {

    @Override
    public void makeVoice() {
        System.out.println("Co-co-co");
    }

    @Override
    public void fly(int distance) {

    }

    @Override
    public void swim(int distance) {

    }
}
