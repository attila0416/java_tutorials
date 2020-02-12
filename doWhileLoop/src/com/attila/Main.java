package com.attila;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int bob = 35;
        do{
            System.out.println(bob);
            bob++;
        }
        while(bob < 100);

        char choice;
        do{
            System.out.println("Option 1: Green");
            System.out.println("Option 2: Blue");
            System.out.println("Option 3: Red");
            System.out.println("Option 4: Yellow");
            System.out.println("Choose which option you want.");
            choice = (char) System.in.read();
        } while(choice < '1' || choice > '4');

        switch(choice){
            case '1':
                System.out.println("You chose green!");
                break;
            case '2':
                System.out.println("You chose blue!");
                break;
            case '3':
                System.out.println("You chose red!");
                break;
            case '4':
                System.out.println("You chose yellow!");
                break;
        }
    }
}
