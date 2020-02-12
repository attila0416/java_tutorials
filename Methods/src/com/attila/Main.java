package com.attila;

import javax.sound.midi.Soundbank;
import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        class Human{


            void talk(String name, int age){
                System.out.println("I am " + name + " and I am " + age + " years old.");
            }

            int calculate(int one, int two, int three){
                return one * two * three;
            }
        }
        Human human1 = new Human();
        human1.talk("Terry", 56);

        int product = human1.calculate(5, 6, 7);
        Human human2 = new Human();
        int product2 = human2.calculate(4,5,6);
        human2.talk("Joe", 30);
        System.out.println("First human: " + product + " Second human: " + product2);

    }
}
