package com.java.coffee;

public class Boiler extends Container {
    private boolean boilerEmpty;
    private boolean boilerNotEmpty;

    public Boiler() {
        super(0);
        boilerEmpty = true;
        boilerNotEmpty = false;
    }

    public Boiler(int cup) {
        super(cup);
    }

    public boolean getBoilerEmpty() {
        return boilerEmpty;
    }

    public void setBoilerEmpty(boolean boilerEmpty) {
        this.boilerEmpty = boilerEmpty;
    }

    public boolean getBoilerNotEmpty() {
        return boilerNotEmpty;
    }

    public void setBoilerNotEmpty(boolean boilerNotEmpty) {
        this.boilerNotEmpty = boilerNotEmpty;
    }

    public void setCups(int numCups) {
        addCup(numCups);
        boilerNotEmpty = true;
        boilerEmpty = false;
    }

    public boolean isEmpty() {
        return boilerEmpty;
    }
}
