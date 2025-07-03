package com.polymorphism;

public class Method_Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.education();
        c.show();

    }
}
class Parent{
    public void education(){
        System.out.println("to became doctor");
    }
}
class Child extends Parent{
    public void education(){
        System.out.println("became a trainer");
    }
    public void show(){
        System.out.println("i am from child");
    }
}
