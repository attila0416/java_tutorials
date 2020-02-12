package com.attila;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type the temperature(Celsius) to be converted to Fahrenheit: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " Fahrenheit.");
    }
}
