package edu.iu.habahram.coffeeorder.model;

public class Receipt {
    private final int id;
    private final String description;
    private final float cost;

    public Receipt(int id, String description, float cost) {
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    public int id() {
        return id;
    }

    public String description() {
        return description;
    }

    public double cost() {
        return cost;
    }

}
