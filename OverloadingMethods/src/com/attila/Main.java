package com.attila;

public class Main {

    public static void main(String[] args) {
        class Booger{

            int findSum(int a, int b){
                int sum = a + b;
                return sum;
            }
            int findSum(String a, int b) {
                int sum = a + b;
                return sum;
            }
            int findSum(int a, int b, int c){
                int sum = a + b + c;
                return sum;
            }
            void findSum(){
                System.out.println("You did not provide any values");
            }
        }
        Booger one = new Booger();
        System.out.println(one.findSum(1,3));
        System.out.println(one.findSum(2, 3, 4));
        one.findSum();
    }
}
