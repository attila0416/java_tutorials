package com.attila;

class Number{
    int number;
    Number(int giveMeNumber){
        this.number = giveMeNumber;
    }

    Number square(){
        Number temporaryObject = new Number(this.number * this.number);
        return temporaryObject;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}


public class Main {

    public static void main(String[] args) {
        Number friend = new Number(5);
        Number friend2 = friend.square();
        System.out.println("Old number from first object: " + friend.getNumber());
        System.out.println("Old number from second object: " + friend2.getNumber());

    }
}
