package com.java.inheritance;

//Parent class
class Animal {
 void eat() {
     System.out.println("Animal is eating...");
 }
}

//Child class inheriting from Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking...");
 }
}

public class SingleInheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat(); // Inherited method from Animal class
     dog.bark(); // Method from Dog class
 }
}

