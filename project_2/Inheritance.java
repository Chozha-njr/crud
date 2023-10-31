package javaproject1;


class Animal {
 void eat() {
     System.out.println("Animal is eating.");
 }
}


class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking.");
 }
}


interface Carnivore {
 void hunt();
}

interface Herbivore {
 void graze();
}


class Cow extends Animal implements Herbivore {
 
 void eat() {
     System.out.println("Cow is grazing.");
 }

 public void graze() {
     System.out.println("Cow is a herbivore.");
 }
}

class Lion extends Animal implements Carnivore {

 void eat() {
     System.out.println("Lion is hunting.");
 }

 public void hunt() {
     System.out.println("Lion is a carnivore.");
 }
}

public class Inheritance {

 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat(); 
     dog.bark();

     Cow cow = new Cow();
     cow.eat();  
     cow.graze();

     Lion lion = new Lion();
     lion.eat(); 
     lion.hunt();
 }
}
