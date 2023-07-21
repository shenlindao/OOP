package Seminar.Seminar_02.Ex_02;

public abstract class Actor implements ActorBehavoir {

    private String name;
    private boolean made_order;
    private boolean take_order;

    public Actor(String name, boolean made_order, boolean take_order) {
        this.name = name;
        this.made_order = made_order;
        this.take_order = take_order;
    }

    public String getName() {
        return name;
    }
}
