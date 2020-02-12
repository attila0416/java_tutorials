package com.attila;

public class Main {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println(x);
        System.out.println(y);
        // AND operator
        System.out.println(x & y);
        // they both have to be TRUE in order for the addition to be true

        // OR operator (there has to be at least one true)
        System.out.println(x | y);

        // XOR operator (there has to be only one true to be true)
        System.out.println(x ^ y);

        // Short-circuit AND (if the first one is false then it puts false automatically)
        System.out.println(x && y);

        // SHort-circuit OR (only check whether or not the first one is true)
        System.out.println(x || y);

        // NOT operator (it returns the opposite value)
        System.out.println(!x);
    }
}
