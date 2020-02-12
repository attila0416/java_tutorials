package com.attila;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        while(number != 100){
            System.out.println(number);
            number++;
        }

        int neck[] = {12, 13, 14, 15, 16};
        int i = 0;
        // neck.length equals to the number of values in the array above
        while(i != neck.length){
            System.out.println(neck[i]);
            i++;
        }

        String random = "It is raining.";
        while("It is not raining." != random){
            System.out.println("The weather is perfect to go outside.");
            break;
        }
    }
}
