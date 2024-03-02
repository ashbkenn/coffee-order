package edu.iu.habahram.coffeeorder.model;

public class DarkRoast extends Beverage{

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
    @Override
    public float cost() {
        return 1.99F;
    }


}
