package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new JalapenoDecorator(new MushroomDecorator(new JalapenoDecorator(new MargharetaPizza())));
        System.out.println("Price is\t" + basePizza.cost());
    }
}
