package com.java.inheritance;

//Parent class
class Animal2 {
 void eat() {
     System.out.println("Animal is eating...");
 }
}

//Child class inheriting from Animal
class Dog2 extends Animal {
 void bark() {
     System.out.println("Dog is barking...");
 }
}

//Another child class inheriting from Animal
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing...");
 }
}

public class HierarchicalInheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     Cat cat = new Cat();

     System.out.println("Dog actions:");
     dog.eat(); // Inherited method from Animal class
     dog.bark(); // Method from Dog class

     System.out.println("\nCat actions:");
     cat.eat(); // Inherited method from Animal class
     cat.meow(); // Method from Cat class
 }
}

