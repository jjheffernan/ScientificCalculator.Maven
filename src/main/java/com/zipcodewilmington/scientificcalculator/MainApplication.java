package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static String powerOffPrompt = "Calculator powering off...";

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!".toUpperCase());

        String input;
        boolean activeCalc = true;
        String d = "d";
        String m = "m";



        MainApplication mainCalc = new MainApplication();
        Calculator coreCalc = new Calculator();
        ScientificFts scientificFeats = new ScientificFts();


        mainCalc.displayMenu();

        while (activeCalc) {
            input = mainCalc.userInput();

            switch (input) {
                case "d":
                    System.out.println("You entered " + d + "\n");
                    scientificFeats.switchDisplayMode();
                    break;
                case "m":
                    System.out.println("You entered " + m + "\n");
                    break;
                case "+":
                    System.out.println("Addition happening");
                    coreCalc.add();
                case "q":
                    System.out.println(powerOffPrompt);
                    activeCalc = false;
                    exit(5);
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }



/*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
*/



    }

    public void displayMenu() {
//        String header = "execute scientific features\n";
        String separator = "************************************************\n";

        String switchDisplay = "d: cycle display modes(binary, octal, decimal, hexadecimal)\n";
        String storeValMemory = "m: store up to one numeric value in memory for recall later\n";
        String trigFunctionality = "t: execute trigonometry functions\n";
        String addition = "+: begin addition calculation\n";
        String subtraction = "-: begin subtraction calculation\n";
        String multiplication = "*: begin multiplication calculation\n";
        String quit = "q: quit";

        String menu = (separator +
                switchDisplay + storeValMemory + trigFunctionality +
                addition + subtraction + multiplication +
                quit);
        System.out.println(menu);
    }

    public String userInput() {
        String inputPrompt = "Enter letter to select feature: ";
        System.out.print(inputPrompt);
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    }


}
