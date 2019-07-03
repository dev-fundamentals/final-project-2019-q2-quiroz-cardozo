package com.java.coffe;

public class Container {
    private final int limit = 12;
    protected int cups;

    public Container(int cup) {
        putCups(cup);
    }

    public int getCup() {
        return cups;
    }

    public void addCup(int quantity){
        putCups(quantity + cups);
    }

    /**
     * Method that set the capacity of cups.
     *
     * @param quantity
     */
    public void putCups(int quantity) {
        if (quantity > limit) {
            throw new IllegalArgumentException("The capacity is only " + limit +  " cups.");
        } else {
            this.cups = quantity;
        }
    }
}
