package org.example.decorator;

public class VegPizza implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
