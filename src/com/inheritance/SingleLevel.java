package com.inheritance;

import org.w3c.dom.ls.LSOutput;

public class SingleLevel {
public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.bark();
}
}

    class Animal {
        void eat() {
            System.out.println("this animal eats food");
        }
    }
    class Dog extends Animal{
    void bark(){
        System.out.println("the dog barks");
    }
}










