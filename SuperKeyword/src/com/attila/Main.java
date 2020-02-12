package com.attila;

//Superclass
class Animal{
    String name;
    Animal(){
        System.out.println("Hi, I'm an animal");
    }
    Animal(String name){
        System.out.println("I am " + name);
    }
}
//Subclass
class Dog extends Animal{

    //default constructor (meaning it doesn't have any perimeters)
    Dog(){
        System.out.println("I am a dog.");
    }
    Dog(String name){
        super(name);
        System.out.println("I am a dog.");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();


    }
}
