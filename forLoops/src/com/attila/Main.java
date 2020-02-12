package com.attila;

public class Main {

    public static void main(String[] args) {

        // for(initialisation, condition, iteration){
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
        // see if number is prime
        int num;
        boolean isPrime;
        num = 13;
        if(num < 2) isPrime = false;
        else isPrime = true;

        for(int i = 2; i <= num/i; i++){
            if((num % i ) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }

        int a, b;
        for(a = 1, b = 4; a < 6; a++){
            System.out.println(a);
            System.out.println(b);
            b--;
        }
    }
}
