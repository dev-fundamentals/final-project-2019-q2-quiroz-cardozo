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
        String message;
        int quantity;

        do {
            switch (option) {
                case 1:
                    message = "How many coffee beans do you want to put in?";
                    quantity = enterAChoice(message);
                    coffeeMaker.putCoffeeGrounds(quantity);
                    break;
                case 2:
                    message = "How many glasses of water do you want to place?";
                    quantity = enterAChoice(message);
                    coffeeMaker.putWaterGlasses(quantity);
                    break;
                case 3:
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Sorry, please enter a valid Option");
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

    private static int enterAChoice(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}