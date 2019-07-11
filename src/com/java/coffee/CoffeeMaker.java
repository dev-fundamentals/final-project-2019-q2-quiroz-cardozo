package com.java.coffee;

public class CoffeeMaker {
    private Boiler boiler;
    private Filter filter;

    public CoffeeMaker() {
        boiler = new Boiler();
        filter = new Filter();
    }

    public void putWaterGlasses(int numCups) {
        boiler.setCups(numCups);
    }

    public void putCoffeeGrounds(int quantity) {
        filter.setCoffeeGrounds(quantity);
    }

    public void pressBrewButton() {
        if (!boiler.isEmpty()) {}
    }

    public void brewCoffee(int numOfCoffeeCups) {

    }
}
