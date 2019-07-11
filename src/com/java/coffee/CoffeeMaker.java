package com.java.coffee;

public class CoffeeMaker {
    private Boiler boiler;

    public CoffeeMaker() {
        boiler = new Boiler();
    }

    public void putWaterGlasses(int numCups) {
        boiler.setCups(numCups);
    }

    public void putCoffeeGrounds() {

    }

    public void pressBrewButton() {
        if (!boiler.isEmpty()) {}
    }

    public void brewCoffee(int numOfCoffeeCups) {

    }
}
