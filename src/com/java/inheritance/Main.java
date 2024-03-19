package com.java.inheritance;

//Parent class
class Vehicle {
 String brand;
 int year;

 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 void display() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
 int numOfDoors;

 public Car(String brand, int year, int numOfDoors) {
     super(brand, year); // calling parent class constructor
     this.numOfDoors = numOfDoors;
 }

 void display() {
     super.display(); // calling parent class method
     System.out.println("Number of doors: " + numOfDoors);
 }
}

public class Main {
 public static void main(String[] args) {
     Vehicle vehicle = new Vehicle("Toyota", 2020);
     Car car = new Car("Honda", 2018, 4);

     System.out.println("Vehicle details:");
     vehicle.display();

     System.out.println("\nCar details:");
     car.display();
 }
}

