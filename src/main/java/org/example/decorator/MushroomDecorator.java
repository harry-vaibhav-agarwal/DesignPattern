package org.example.decorator;

public class MushroomDecorator implements ToppingsDecorator{
    private BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
