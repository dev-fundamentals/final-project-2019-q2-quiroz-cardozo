package com.java.coffe;

public class CoffeMaker {
    private Boiler boiler;

    public CoffeMaker() {
        boiler = new Boiler();
    }

    public void putCups(int numCups) {
        boiler.setCups(numCups);
    }

    public void pressBrewButton() {
        
    }
}
