package com.attila;

public class Main {

    public static void main(String[] args) {
        int money = 12;
        switch(money){
            // case is like a condition
            case 11:
                System.out.println("You have 11 coins");
                break;
            case 12:
                System.out.println("You have 12 coins");
                break;
            case 13:
                System.out.println("You have 13 coins");
                break;
            default:
                System.out.println("System was unable to tell how many counts you own");
        }

        String katy = "Katy";
        switch(katy){
            case "Bob":
                System.out.println("Bob");
                break;
            case "Jerry":
                System.out.println("Jerry");
                break;
            case "Tom":
                System.out.println("Tom");
                break;
            default:
                System.out.println("The name, " + katy + ", was not found in the system.");
        }

        int month = 4;
        String season = null;
        switch(month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("That month does not exist.");
        }
        System.out.println("The current season is " + season);
    }
}
