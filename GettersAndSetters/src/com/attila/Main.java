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


            // Getter and Setter
            public String getName(){
                return name;
            }
            public void setName(String name){
                this.name = name;
            }
            public int getAge(){
                return age;
            }
            public void setAge(int age){
                this.age = age;
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
        Zebra zebra2 = new Zebra("Tom", 41);
        zebra2.talk();
        System.out.println(zebra1.getName());
        zebra1.setName("James");
        System.out.println(zebra1.getName());
        zebra1.setAge(21);
        System.out.println(zebra1.getAge());

        class BankAccount{
            String accountNumber;
            long balance;
            String userFirstName;
            String userLastName;
            String address;
            int age;

            public String getAccountNumber() {
                return accountNumber;
            }
            public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public long getBalance() {
                return balance;
            }
            public void setBalance(long balance) {
                this.balance = balance;
            }

            public String getUserFirstName() {
                return userFirstName;
            }
            public void setUserFirstName(String userFirstName) {
                this.userFirstName = userFirstName;
            }

            public String getUserLastName() {
                return userLastName;
            }
            public void setUserLastName(String userLastName) {
                this.userLastName = userLastName;
            }

            public String getAddress() {
                return address;
            }
            public void setAddress(String address) {
                this.address = address;
            }

            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }

            public void addMoney(long amount){
                balance = balance + amount;
            }
            public void deductMoney(long amount){
                balance = balance - amount;
            }

            //Constructor
            public BankAccount(String accountNumber, long balance, String userFirstName, String userLastName, String address, int age) {
                this.accountNumber = accountNumber;
                this.balance = balance;
                this.userFirstName = userFirstName;
                this.userLastName = userLastName;
                this.address = address;
                this.age = age;
            }
        }

        BankAccount AttilaAccount = new BankAccount("120050007", 2507428, "Attila", "Fazekas", "7 Top Avenue, Sydney, Australia", 21);
        System.out.println(AttilaAccount.getAccountNumber());
        System.out.println(AttilaAccount.balance);
        AttilaAccount.addMoney(600);
        AttilaAccount.deductMoney(4040);
        System.out.println(AttilaAccount.balance);
    }
}
