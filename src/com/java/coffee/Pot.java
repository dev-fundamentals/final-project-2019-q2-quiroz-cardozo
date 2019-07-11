package com.java.coffee;

public class Pot extends Container {
    private String warmerEmpty;
    private String potEmpty;
    private String potNotEmpty;

    public Pot(int cup) {
        super(cup);
    }

    public String getWarmerEmpty() {
        return warmerEmpty;
    }

    public void setWarmerEmpty(String warmerEmpty) {
        this.warmerEmpty = warmerEmpty;
    }

    public String getPotEmpty() {
        return potEmpty;
    }

    public void setPotEmpty(String potEmpty) {
        this.potEmpty = potEmpty;
    }

    public String getPotNotEmpty() {
        return potNotEmpty;
    }

    public void setPotNotEmpty(String potNotEmpty) {
        this.potNotEmpty = potNotEmpty;
    }
}
