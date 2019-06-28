package com.java.coffe;

public class Container {
    private final int limit = 12;
    protected int cup;

    public Container(int cup) {
        this.cup = cup;
    }

    public int getCup() {
        return cup;
    }

    public void addCup(int quantity){
        this.cup += quantity;
    }
}
