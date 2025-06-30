package com.inheritance;

public class MultiLevel {
public static void main(String[] args) {
    Dogs b = new Dogs();
    b.eat();
    b.dog();
    b.weep();
}




}
class Animals{
    void dog(){
        System.out.println("the dog barks");

    }
}
class Puppy extends Animals{
    void weep(){

        System.out.println("the puppy weeps");

    }
}
class Dogs extends Puppy{
    void eat(){
        System.out.println("dogs eat meat");
    }
}