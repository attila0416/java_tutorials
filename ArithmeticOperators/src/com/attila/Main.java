package com.attila;

public class Main {

    public static void main(String[] args) {

        // addition
        int addtion = 12 + 12;
        double addition2 = 12.0 + 12.0;
        System.out.println(addtion + " " + addition2);

        // subtraction
        int subtraction = 12 - 11;
        double subtraction2 = 12.0 - 11.0;
        System.out.println(subtraction + " " + subtraction2);

        // multiplication
        int multiplication = 12 * 12;
        double multiplication2 = 12.0 * 12.0;
        System.out.println(multiplication + " " + multiplication2);

        // division
        int division = 25 / 5;
        double division2 = 25.0 / 5.0;
        System.out.println(division + " " + division2);

        // modulus
        int mod = 25 % 6;
        System.out.println(mod);
        double mod2 = 25.6 % 3.9;
        System.out.println(mod2);

        // compound assignment operators
        int plane = 0;
        // plane = plane + 1;
        plane++;
        System.out.println(plane);
        int plane2 = 0;
        // plane2 = plane2 + 5;
        plane2 += 5;
        System.out.println(plane2);

        int y = 25;
        int x = ++y;
        System.out.println(x);

    }
}
