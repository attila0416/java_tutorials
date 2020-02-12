package com.attila;

public class Main {

    public static void main(String[] args) {
        String name = "Attila";
        if(name == "Attila"){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(name != "Attila"){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        int num1 = 10;
        int num2 = 10;
        if(num1 > num2){
            System.out.println("bigger");
        }
        else if(num1 == num2){
            System.out.println("equal");
        }
        else{
            System.out.println("smaller");
        }
        /* relational operators for if statements:
        ==  equal to
        !=  not equal to
        <  less than
        >  greater than
        >=  greater or equal to
        <=  smaller or equal to

        || means OR in boolean statements
         */
    }
}
