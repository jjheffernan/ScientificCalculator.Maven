package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.exit;

public class ScientificFts {

    public static void main(String[] args) {
        String input;
        boolean activeCalc = true;
        String d = "d";
        String m = "m";
        String q = "q";


        ScientificFts tester = new ScientificFts();
        tester.displayMenu();


        while (activeCalc) {
            input = tester.userInput();

            switch (input) {
                case "d":
                    System.out.println("You entered " + d + "\n");
                    tester.cycleDisplayMenu(33);
                    break;
                case "m":
                    System.out.println("You entered " + m + "\n");
                    break;
                case "q":
                    System.out.println("Calculator powering off...");
                    activeCalc = false;
                    exit(5);
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
/*
        if (tester.userInput().equals("d")) {
            System.out.print("You selected " + d);
        }
        else if (tester.userInput().equals("m")) {
            System.out.println("You selected " + m);
        }
*/
    }
    /*        String input = tester.userInput();

     */

/*
        switch (input) {
            case "q":
                System.out.println("quitting calculator");
                break;
            case "d":
                tester.switchDisplayMode(33);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
    }
*/

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

    public String userInput() {
        String inputPrompt = "Enter a letter to select feature: ";
        System.out.print(inputPrompt);
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    }

    public String cycleDisplayMenu(int num) {
        DecimalFormat df = new DecimalFormat("0.00");
        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));
        int index = 0;
        String dm = "dm";
        String res = null;

        String displayModeHeader = "display modes\n".toUpperCase();
        String cycDisplayModePrompt = "dm: next display mode\n";
        String chooseDisplayModePrompt = "cm: choose display mode\n";

        String[] modeTitlesArr = {"binary", "octal", "decimal", "hexadecimal"};
        String modeTitles = ("(" + modeTitlesArr[0] + ", " + modeTitlesArr[1] + ", " +
                modeTitlesArr[2] + ", " + modeTitlesArr[3] + ")\n");
        String[] arr = {binary, octal, decimal, hexadecimal};

        String displayModeMenu = (displayModeHeader +
                modeTitles + cycDisplayModePrompt + chooseDisplayModePrompt);
        System.out.println(displayModeMenu);

        boolean displayModeActive = true;
        while (displayModeActive) {
            String input = userInput();
            switch (input) {
                case "dm":
//                    print statement can be improved
                    System.out.println(num + " = " + modeTitlesArr[index] + ": " + arr[index]);
                    index++;

                    if (index == arr.length) {
                        index = 0;
                    }
                    break;
                case "cm":
                    chooseDisplayMode(userInput(), 33);
//                    chooseDisplayModePrompt(String.valueOf(), 33);
                    break;
                case "q":
                    System.out.println("Calculator powering off...");
                    displayModeActive = false;
                    exit(5);
/*
                case "binary":
                    System.out.println("Binary value displaying");
                    res.equals(binary);
                    break;
                case "octal":
                    System.out.println("Octal value displaying");
                    res.equals(octal);
                    break;
                case "decimal":
                    System.out.println("Decimal value displaying");
                    res.equals(decimal);
                    break;
                case "hexadecimal":
                    System.out.println("Hexadecimal value displaying");
                    res.equals(hexadecimal);
                    break;
*/
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
        return res;
    }

    public String chooseDisplayMode(String mode, int num) {
        boolean choosingDisplayMode = true;
        DecimalFormat df = new DecimalFormat("0.00");
        mode = userInput();
//        input = mode;

        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));

        while (choosingDisplayMode) {
            switch (mode) {
                case "binary":
//                    print statement below displays in terminal but loops continuously *FIX
                    System.out.print("Binary value displaying: " + binary);
                    break;
                case "octal":
                    System.out.print("Octal value displaying: " + octal);
//                    mode.equals(octal);
                    break;
                case "decimal":
                    System.out.println("Decimal value displaying: " + decimal);
//                    input.equals(decimal);
                    break;
                case "hexadecimal":
                    System.out.println("Hexadecimal value displaying: " + hexadecimal);
//                    input.equals(hexadecimal);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + mode);
            }
        }

        return mode;
    }
}
/*
    void switchDisplayMode(int num) {
        DecimalFormat df = new DecimalFormat("0.00");

        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));
        int index = 0;

        String[] modeTitles = {"binary", "octal", "decimal", "hexadecimal"};
        String[] arr = {binary, octal, decimal, hexadecimal};

        boolean displayModeActive = true;
        String tempDisplayModeStatus = "\ncycling through display modes...\n";
        String nextModeCommand = "dm: next display mode \n";


        String cycleDisplayModeMenu = (tempDisplayModeStatus +
                nextModeCommand + modeTitles);

        while (displayModeActive) {
            System.out.print(cycleDisplayModeMenu);

            if (userInput().equals("dm")) {
                System.out.println(modeTitles[index] + ": " + arr[index]);
                index++;

                if (index == arr.length) {
                    index = 0;
                }
            }
            else if (userInput().equals(modeTitles[0])){
                chooseDisplayMenu(modeTitles[0]);
                System.out.println(binary);
            }
            else {
                displayModeActive = false;
//                displayGreeting();
//                userInput();
            }
        }

    }

    void chooseDisplayMenu(String mode) {
//        String displayModeChoices = "\nEnter a mode: (binary, octal, decimal, hexadecimal)";
//        System.out.print(displayModeChoices);

    }
*/
