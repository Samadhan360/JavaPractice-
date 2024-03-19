package com.java.inheritance;

//Interface defining behavior
interface Animal1 {
 void eat();
}

//Parent class
class Dog1 implements Animal1 {
 public void eat() {
     System.out.println("Dog is eating...");
 }

 void bark() {
     System.out.println("Dog is barking...");
 }
}

//Child class inheriting from Dog
class Labrador1 extends Dog {
 void color() {
     System.out.println("Labrador is black in color...");
 }
}

//Interface defining behavior
interface Pet {
 void play();
}

//Class implementing multiple interfaces
class PetLabrador extends Labrador implements Pet {
 public void play() {
     System.out.println("Labrador is playing...");
 }
}

public class HybridInheritance {
 public static void main(String[] args) {
     PetLabrador petLabrador = new PetLabrador();
     petLabrador.eat(); // Inherited method from Dog class
     petLabrador.bark(); // Inherited method from Dog class
     petLabrador.color(); // Method from Labrador class
     petLabrador.play(); // Method from Pet interface
 }
}

