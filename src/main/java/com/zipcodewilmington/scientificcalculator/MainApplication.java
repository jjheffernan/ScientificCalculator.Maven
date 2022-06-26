package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }

    public void displayMenu() {
        String header = "execute scientific features\n";
        String separator = "************************************************\n";

        String switchDisplay = "d: cycle display modes(binary, octal, decimal, hexadecimal)\n";
        String storeValMemory = "m: store up to one numeric value in memory for recall later\n";
        String trigFunctionality = "t: execute trigonometry functions\n";
        String quit = "q: quit";

        String menu = (header.toUpperCase() + separator +
                switchDisplay + storeValMemory + trigFunctionality + quit);
        System.out.println(menu);
    }

}
