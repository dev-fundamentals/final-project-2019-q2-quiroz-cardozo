package com.java.coffee;

public class Filter {
    private int coffeeGrounds;
    private final int COFFEE_GROUNDS_LIMIT = 50; // is a number for determine the quantity.

    public Filter() {
        coffeeGrounds = 0;
    }

    public void setCoffeeGrounds(int quantityOfCoffeeGrounds) {
        if (coffeeGrounds + quantityOfCoffeeGrounds > COFFEE_GROUNDS_LIMIT) {
            throw new IllegalArgumentException("The capacity is only " + COFFEE_GROUNDS_LIMIT +  " coffee grounds.");
        } else {
            coffeeGrounds += quantityOfCoffeeGrounds;
        }
    }

    public boolean containCoffeeGrounds() {
        return coffeeGrounds != 0;
    }
}
