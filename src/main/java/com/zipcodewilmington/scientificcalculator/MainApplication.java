package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static String powerOffPrompt = "Calculator powering off...";
    public class varSpace {
        public static double num1;
        public static double num2;
        public static double mem;
        public static String userChoice;
    }

    boolean activeCalc = true;

    public static void main(String[] args) {
        String powerOffPrompt = "Calculator powering off...";
        String inputPrompt = "Enter letter to select feature: ";
        // String addPrompt = "Add two numbers:\n";
        // String subPrompt = "Subtract two numbers\n";


        MainApplication mainApp = new MainApplication();
        ScientificFts tester = new ScientificFts();
        Calculator coreCalc = new Calculator();
        Console userInput = new Console();

        String input;
        String prompt = null;
        boolean activeCalc = true;
        // String d = "d";
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
            input = userInput.getStringInput("Enter a letter to select features");

            switch (input) {
                // case one: display mode
                case "d":
                    System.out.print(inputPrompt);
                    System.out.println("You entered d");
                    tester.switchDisplayMode();
                    break;
                // enter number case
                case "e":
                    varSpace.num1 = userInput.getDoubleInput("Enter a number for display\n");
                    System.out.println(varSpace.num1);
                // case two: memory mode
                    break;
                case "m":
                    System.out.println("You entered " + m + "\n");

                    break;
                case "t":
                    System.out.println("You entered " + t + "\n");

                    break;
                // case three:
                case "a":
                    // System.out.println(addPrompt);
                    // double addX =userInput.getDoubleInput("enter a number to add: ");
                    // double addY =userInput.getDoubleInput("another one: ");
                    // System.out.println(coreCalc.add(addX, addY));
                    coreCalc.Arithmetic();
                    break;
                // case four:
                case "-":
                    // System.out.println(subPrompt);
                    double subX = userInput.getDoubleInput("");
                    double subY = userInput.getDoubleInput("");
                    System.out.printf("subtracting %.4f from %.4f gives \n" +
                    coreCalc.subtract(subX,subY),subX,subY);
                    break;
                // case five:
                case "*":
                    int multX = userInput.getIntegerInput("");
                    int multy = userInput.getIntegerInput("");
                    System.out.println(coreCalc.multiply(multX,multy));
                    break;
                //case six:
                case "/":
                    double divX = userInput.getDoubleInput("");
                    double divY = userInput.getDoubleInput("");
                    String res = String.valueOf(coreCalc.divide(divX,divY));
                    System.out.println(res);
                    break;
                //case seven:
                case "q":
                    System.out.println(powerOffPrompt);
                    activeCalc = false;
                    exit(5);
                //default case:
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }

    }

    /* public String userInput() {
//        String inputPrompt = "Enter letter to select feature: ";
//        System.out.print(inputPrompt);
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    } */

    public void displayMenu() {
        String header = "execute scientific features\n";
        String separator = "************************************************\n";

        String switchDisplay = "d: cycle display modes(binary, octal, decimal, hexadecimal)\n";
        String storeValMemory = "m: store up to one numeric value in memory for recall later\n";
        String trigFunctionality = "t: execute trigonometry functions\n";

        String addition = "+: addition calculation\n";
        String subtraction = "-: subtraction calculation\n";
        String multiplication = "*: multiplication calculation\n";
        String division = "/: division calculation\n";
        String quit = "q: quit";

        String menu = (header.toUpperCase() + separator +
                switchDisplay + storeValMemory + trigFunctionality +
                addition + subtraction + multiplication + division + quit);
        System.out.println(menu);
    }



}
