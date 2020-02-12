package com.attila;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Our Array: " + Arrays.toString(list));
        int find = 10;
        for(int i = 0; i < list.length; i++){
            System.out.println("Checking..." + list[i]);
            if(find == list[i]){
                System.out.println("It matched!");
                break;
            }
        }

        String list2[] = {"tom", "jerry", "bob", "tim", "terry", "simon", "jack"};
        System.out.println("Our Array: " + Arrays.toString(list));
        String find2 = "tim";
        for(int i = 0; i < list2.length; i++){
            System.out.println("Checking..." + list2[i]);
            if(list2[i] .equals(find2)){
                System.out.println("It matched!");
                break;
            }
        }
    }
}
