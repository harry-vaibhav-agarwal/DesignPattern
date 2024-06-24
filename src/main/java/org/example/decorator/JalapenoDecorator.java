package org.example.decorator;

public class JalapenoDecorator implements ToppingsDecorator {
    private BasePizza basePizza;

    public JalapenoDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
