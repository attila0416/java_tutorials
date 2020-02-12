package com.attila;

public class Main {

    public static void main(String[] args) {
        class Zebra{
            String name;
            int age;

            //Constructor
            Zebra(String ParamName, int ParamAge) {
                System.out.println("Making a new Zebra...");
                name = ParamName;
                age = ParamAge;
            }


            void talk(){
                System.out.println("*Zebra noises*... Hi, my name is " + name + " and I am " + age + " years old");
            }

            void ageUp(){
                age++;
                System.out.println("I am now " + age);
            }
        }
        Zebra zebra1 = new Zebra("Bob", 24);
        zebra1.talk();
        zebra1.ageUp();
        zebra1.ageUp();
        Zebra zebra2 = new Zebra("Tom", 41);
        zebra2.talk();
        zebra2.ageUp();
        System.out.println(zebra1.name);
    }
}
