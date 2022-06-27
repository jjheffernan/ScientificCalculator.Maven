package com.zipcodewilmington.scientificcalculator;

import com.sun.tools.javac.Main;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.exit;



public class ScientificFts {
//    static String powerOffPrompt = "Calculator powering off...";
//    Calculator calc = new Calculator();
//    int val = calc.add(15, 18);

    public static void main(String[] args) {
//        String input;
//        boolean activeCalc = true;
//        String d = "d";
//        String m = "m";
//        String t = "t";
//        String add = "+";
//        String q = "q";




//        ScientificFts tester = new ScientificFts();
//        MainApplication mainApp = new MainApplication();
//        mainApp.displayMenu();



//        while (activeCalc) {
//            input = mainApp.userInput();
//
//            switch (input) {
//                case "d":
//                    System.out.println("You entered " + d + "\n");
//                    tester.switchDisplayMode();
//                    break;
//                case "m":
//                    System.out.println("You entered " + m + "\n");
//                    break;
//                case "+":
//                    System.out.println("Addition happening");
//                case "q":
//                    System.out.println(powerOffPrompt);
//                    activeCalc = false;
//                    exit(5);
//                default:
//                    throw new IllegalStateException("Unexpected value: " + input);
//            }
//        }
    }


/*
    public String userInput() {
        String inputPrompt = "Enter letter to select feature: ";
        System.out.print(inputPrompt);
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    }
*/

    /*DISPLAY MODES*/
    public String binaryVal(int n) {
        return (Integer.toBinaryString(n));
    }

    public String octalVal(int n) {
        return (Integer.toOctalString(n));
    }

    public String decimalVal(int n) {
        DecimalFormat df = new DecimalFormat("0.00");
        return (df.format(n));
    }

    public String hexadecimalVal(int n) {
        return (Integer.toHexString(n));
    }


    public void switchDisplayMode() {
        int testVal = 33;
        int count = 0;
        String arr[] = {binaryVal(testVal), octalVal(testVal),
                decimalVal(testVal), hexadecimalVal(testVal)};
        String[] modeTitles = {"binary", "octal", "decimal", "hexadecimal"};

        String displayModesHeader = "display modes\n";
        String modes = ("(" + modeTitles[0] + ", " + modeTitles[1] + ", " +
                modeTitles[2] + ", " + modeTitles[3]);
        String displayModesPrompt = ("\nnm: next mode\ncm: choose mode");
        String displayModesMenu = (displayModesHeader.toUpperCase() + modes + displayModesPrompt);
        System.out.println(displayModesMenu);

        boolean activeDisplayMode = true;
        while (activeDisplayMode) {
            MainApplication mainApp = new MainApplication();
            String input = mainApp.userInput();
            switch (input) {
                case "nm":
                    System.out.println(testVal + " to " + modeTitles[count] +
                            " value = " + arr[count]);
                    count++;

                    if (count == arr.length) {
                        count = 0;
                    }
                    break;
                case "cm":
                    System.out.println("\nchoosing display mode...");
                    String displayModeChoicePrompt = ("Choose display mode by typing:" +
                            "(binary, octal, decimal, hexadecimal)\n");
                    System.out.println(displayModeChoicePrompt);

                    switchDisplayMode();
                    break;
                case "q":
                    MainApplication mainCalc = new MainApplication();

                    System.out.println(mainCalc.powerOffPrompt);
                    exit(5);
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }

    public void switchDisplayMode(String mode) {
        boolean choosingDisplayMode = true;
        int testVal = 33;

        while (choosingDisplayMode) {
            switch (mode) {
                case "binary":
                    System.out.println("showing binary calculation");
                    System.out.println(binaryVal(testVal));
                    switchDisplayMode();
                    break;
                case "octal":
                    System.out.println("showing octal calculation");
                    System.out.println(octalVal(testVal));
                    switchDisplayMode();
                    break;
                case "decimal" :
                    System.out.println("showing decimal calculation");
                    System.out.println(decimalVal(testVal));
                    switchDisplayMode();
                    break;
                case "hexadecimal":
                    System.out.println("showing hexadecimal calculation");
                    System.out.println(hexadecimalVal(testVal));
                    switchDisplayMode();
                    break;
                case "q":
                    MainApplication mainCalc = new MainApplication();

                    System.out.println(mainCalc.powerOffPrompt);
                    exit(5);
                default:
                    throw new IllegalStateException("Unexpected value: " + mode);
            }
        }
    }
}










/*
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
                case "nm":
//                    print statement can be improved
                    System.out.println(num + " = " + modeTitlesArr[index] + ": " + arr[index]);
                    index++;

                    if (index == arr.length) {
                        index = 0;
                    }
                    break;
                case "cm":
                    System.out.println("Choosing display mode...");
                    break;
                case "q":
                    System.out.println("Calculator powering off...");
                    displayModeActive = false;
                    exit(5);
*/
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
*//*

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
        return res;
    }
*/

/*
    public String chooseDisplayMode(String mode, int num) {
        boolean choosingDisplayMode = true;
        DecimalFormat df = new DecimalFormat("0.00");
        mode = userInput();
//        input = mode;

        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));
    }
*/


//display mode methods
/*
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
*/
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
