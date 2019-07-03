package com.java;

import com.java.coffe.CoffeeMaker;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.putWaterGlasses(15);
        coffeeMaker.pressBrewButton();
    }
}
