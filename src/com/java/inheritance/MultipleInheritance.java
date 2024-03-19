package com.java.inheritance;

//Interface defining behavior
interface Swimmer {
 void swim();
}

//Interface defining behavior
interface Flyer {
 void fly();
}

//Class implementing multiple interfaces
class Duck implements Swimmer, Flyer {
 public void swim() {
     System.out.println("Duck is swimming...");
 }

 public void fly() {
     System.out.println("Duck is flying...");
 }
}

public class MultipleInheritance {
 public static void main(String[] args) {
     Duck duck = new Duck();
     duck.swim(); // Method from Swimmer interface
     duck.fly(); // Method from Flyer interface
 }
}

