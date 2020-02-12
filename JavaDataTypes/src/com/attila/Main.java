package com.attila;

public class Main {

    public static void main(String[] args) {
	    /* primitive types
	    8 primitive types: byte, short, int, long, char, float, double, boolean
	    integer (whole numbers) types = byte(8), short(16), int(32), long(64)
	    floating numbers (decimal numbers) = float, double
	    symbols = char
	    true or false = boolean
	    */

	    //byte
	    byte bob = 7;
	    System.out.println(bob);

        //short
	    short bank = 32000;
	    System.out.println(bank);

	    //int
        int firstint = 2100500300;
        System.out.println(firstint);

        //compute the distance light travels using long
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance =  lightspeed * seconds;
        System.out.println("In " + days + " days, the light will have travelled " + distance + " miles");

        //float
        float mybankaccount = 12.99f;
        System.out.println(mybankaccount);

        //double
        double mySavingsAccount = 123.123123123123;
        System.out.println(mySavingsAccount);

        //are of circle
        double pi, r, a;
        r = 8.7;
        pi = 3.14;
        a = pi * r * r;
        System.out.println("The Area is " + a);

        //char
        char letter = 'A';
        System.out.println(letter );

        //loop
        double bob2 = 1;
        for(int i = 0; i < 60000; i++){
            bob2++;
            System.out.println(bob2);
        }
    }
}
