package com.attila;

class Tiger{
    String name;
    int age;

    Tiger(String name, int age){
        this.name = name;
        this.age = age;
    }
    Tiger(){
        this.name = null;
        this.age = -1;
    }
    Tiger(Tiger object){
        this.name = object.name;
        this.age = object.age;
    }

    public String getName() {
        if(this.name == null){
            return "You did not provide a name.";
        }
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(this.age == -1){
            System.out.println("You did not provide an age.");
        }
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    void talk(){
        System.out.println("Hi, I am " + this.name + ", the tiger. Nice to meet you!");
        System.out.println("I am " + this.age + " years old.");
    }
}

public class Main {

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger("Larry", 165);
        System.out.println(tiger1.getAge());
        tiger1.talk();

        System.out.println(" ");

        Tiger tiger2 = new Tiger(tiger1);
        tiger2.setAge(14);
        tiger2.talk();
    }
}
