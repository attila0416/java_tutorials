package com.attila;

class Vehicle{
    String name;
    int speed;

    Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    Vehicle(){
        this.name = "Unnamed Vehicle";
        this.speed = 0;
    }

    void displayBasicInformation(){
        System.out.println("Vehicle name: " + this.name);
        System.out.println("Vehicle speed: " + this.speed + " km/h");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle{
    String vehicleType = "Car";
    int numberOfWheels;

    //Constructor - declares the variables
    Car(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    void displayAdvancedInformation(){
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number of Wheels: " + numberOfWheels);

    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Tesla X",210);
        vehicle1.displayBasicInformation();

        Car car1 = new Car(4);
        car1.displayAdvancedInformation();
    }
}
