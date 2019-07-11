package com.java;

import com.java.coffee.CoffeeMaker;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
//        coffeeMaker.putWaterGlasses(15);
//        coffeeMaker.pressBrewButton();

        int option = showMenu();

        do {
            switch (option) {
                case 1:
//                    coffeeMaker
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Sorry, please enter valid Option");
                    showMenu();
                    break;
            }
        } while (option == 4);

        System.out.println("Thank you. Good Bye.");
    }

    private static int showMenu() {
        int option;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Coffee Maker Menu:");
        System.out.println("-------------------------");
        System.out.println("1. Place coffee grounds.");
        System.out.println("2. Place water.");
        System.out.println("3. Brew coffee.");
        System.out.println("4. Quit");
        System.out.println("-------------------------");
        System.out.println("Enter your choice:");
        option = keyboard.nextInt();

        return option;

    }
}
