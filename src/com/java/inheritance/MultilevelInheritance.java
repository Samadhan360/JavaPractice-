package com.java.inheritance;

//Parent class
class Animals {
 void eat() {
     System.out.println("Animal is eating...");
 }
}

//Child class inheriting from Animal
class Dogs extends Animal {
 void bark() {
     System.out.println("Dog is barking...");
 }
}

//Grandchild class inheriting from Dog
class Labrador extends Dog {
 void color() {
     System.out.println("Labrador is black in color...");
 }
}

public class MultilevelInheritance {
 public static void main(String[] args) {
     Labrador labrador = new Labrador();
     labrador.eat(); // Inherited method from Animal class
     labrador.bark(); // Inherited method from Dog class
     labrador.color(); // Method from Labrador class
 }
}

