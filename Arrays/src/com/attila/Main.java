package com.attila;

public class Main {

    public static void main(String[] args) {

        int daysInWeek[] = new int[7];
        daysInWeek[0] = 111;
        daysInWeek[1] = 222;
        daysInWeek[2] = 222;
        daysInWeek[3] = 333;
        daysInWeek[4] = 444;
        daysInWeek[5] = 555;
        daysInWeek[6] = 666;
        System.out.println("Second day of the week: " + daysInWeek[0]);
        System.out.println("Second day of the week: " + daysInWeek[1]);
        System.out.println("Second day of the week: " + daysInWeek[2]);
        System.out.println("Second day of the week: " + daysInWeek[3]);
        System.out.println("Second day of the week: " + daysInWeek[4]);
        System.out.println("Second day of the week: " + daysInWeek[5]);
        System.out.println("Second day of the week: " + daysInWeek[6]);

        //using array initialiser
        int nameOfString[] = {111, 222, 333, 444, 555, 666, 777};

        double floating_numbers[] = {1.1, 2.2, 3.3, 4.4};
        double sum_of_floating_numbers = floating_numbers[0] + floating_numbers[1] + floating_numbers[2] +floating_numbers[3];
        int total_numbers = 4;
        double average = sum_of_floating_numbers / total_numbers;
        System.out.println(average);
    }
}
