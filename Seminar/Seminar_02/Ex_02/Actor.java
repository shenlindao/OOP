package Seminar.Seminar_02.Ex_02;

public abstract class Actor implements ActorBehavoir {

    private String name;
    private boolean made_order;
    private boolean took_order;

    public Actor(String name, boolean made_order, boolean took_order) {
        this.name = name;
        this.made_order = made_order;
        this.took_order = took_order;
    }

    public String getName() {
        return name;
    }
}
