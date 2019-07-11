package com.java.coffee;

public class BrewButton {
    private boolean isStart = false;

    public void TurnOnLight(boolean isStart){
        this.isStart = isStart;
        if (isStart){
            System.out.println("Indicator light turn on");
        }
        else{
            System.out.println("Indicator light turn off");
        }
    }
}
