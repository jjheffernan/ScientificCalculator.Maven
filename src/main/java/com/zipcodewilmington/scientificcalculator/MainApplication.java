package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static String powerOffPrompt = "Calculator powering off...";


    boolean activeCalc = true;

    public static void main(String[] args) {
        String powerOffPrompt = "Calculator powering off...";
        String inputPrompt = "Enter letter to select feature: ";
        String addPrompt = "Add two numbers:\n";
        String subPrompt = "Subtract two numbers\n";


        MainApplication mainApp = new MainApplication();
        ScientificFts tester = new ScientificFts();
        Calculator coreCalc = new Calculator();

        String input;
        boolean activeCalc = true;
        String doub = "d";
        String m = "m";
        String t = "t";
        String add = "+";
        String q = "q";


        mainApp.displayMenu();


/*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

*/

        while (activeCalc) {
            input = mainApp.userInput();

            switch (input) {
                case "d":
                    System.out.print(inputPrompt);
                    System.out.println("You entered " + doub + "\n");
                    tester.switchDisplayMode();
                    break;
                case "m":
                    System.out.println("You entered " + m + "\n");
                    break;
                case "+":
                    System.out.println(addPrompt);
                    float addX = Float.parseFloat(mainApp.userInput());
                    float addY = Float.parseFloat(mainApp.userInput());
                    System.out.println(coreCalc.add(addX, addY));
                    break;
                case "-":
                    System.out.println(subPrompt);
                    double subX = Double.parseDouble(mainApp.userInput());
                    double subY = Double.parseDouble(mainApp.userInput());
                    System.out.printf("subtracting %.4f from %.4f gives " +
                            coreCalc.subtract(subX,subY),subX,subY);
                    break;
                case "*":
                    int multX = Integer.parseInt(mainApp.userInput());
                    int multy = Integer.parseInt(mainApp.userInput());
                    System.out.println(coreCalc.multiply(multX,multy));
                case "/":
                    double divX = Double.parseDouble(mainApp.userInput());
                    double divY = Double.parseDouble(mainApp.userInput());
                    String res = String.valueOf(coreCalc.divide(divX,divY));
                    System.out.println(res);
                case "q":
                    System.out.println(powerOffPrompt);
                    activeCalc = false;
                    exit(5);
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }

    }

    public String userInput() {
//        String inputPrompt = "Enter letter to select feature: ";
//        System.out.print(inputPrompt);
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    }

    public void displayMenu() {
        String header = "execute scientific features\n";
        String separator = "************************************************\n";

        String switchDisplay = "d: cycle display modes(binary, octal, decimal, hexadecimal)\n";
        String storeValMemory = "m: store up to one numeric value in memory for recall later\n";
        String trigFunctionality = "t: execute trigonometry functions\n";

        String addition = "+: addition calculation\n";
        String subtraction = "-: subtraction calculation\n";
        String multiplication = "*: multiplication calculation\n";
        String division = "/: division calculation";
        String quit = "q: quit";

        String menu = (header.toUpperCase() + separator +
                switchDisplay + storeValMemory + trigFunctionality +
                addition + subtraction + multiplication + division + quit);
        System.out.println(menu);
    }



}
