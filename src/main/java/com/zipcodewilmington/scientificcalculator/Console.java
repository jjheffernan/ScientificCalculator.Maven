package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public char getCharInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        char userInput = scanner.next().charAt(0);
        return userInput;
    }

    public int getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = String.valueOf(scanner.nextInt());
        return Integer.parseInt(userInput);
    }

    public double getDoubleInput(String prompt) {
        //while (!prompt.)
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }
}
