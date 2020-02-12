package com.attila;

public class Main {

    public static void main(String[] args) {
        // if a condition is true then print out a message
        int level = 20;
        int required_level = 15;
        if(level >= required_level){
            System.out.println("You may enter the castle.");
        }
        if(level == 1){
            System.out.println("I will let you pass just this once for your first mission.");
        }
        else{
            System.out.println("Your level is too low to enter the castle. The required level is level 15.");
        }
        // boolean if statement
        boolean raining = true;
        if(raining){
            System.out.println("It's currently raining.");
        }
        else{
            System.out.println("The weather is great outside, it is currently not raining.");
        }
        // if statement inside the if statement
        int money = 100;
        int cost = 5;
        if(money >= cost){
            System.out.println("You may pass the gates of Rivia.");
            if(money >= 500){
                System.out.println("But the cost is 10 coins for your kind.");
            }
            else{
                System.out.println("Feel free to stay as long as you like.");
            }
        }
        else{
            System.out.println(money + " is not enough to enter through these gates. Come back once you have 5 coins.");
            if(money <=1){
                System.out.println("Why are you even here?");
            }
        }
        // there is also else if()
        // you can have multiple else if, but only one else


    }
}
