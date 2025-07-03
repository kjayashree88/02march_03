package com.inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.beautiful();
        p.makeSound();
        

    }
    }
    class Birds{
    String food = "fruits";
    public  void  makeSound(){
            System.out.println("the birds are eating " + food +"and making sound");
        }
    }
class Peacock extends Birds{
    String colour = "bluish green";
    public  void setColour(){
        System.out.println("the pecock is " + colour +"in colour");

    }
}
class Parrot extends Birds{
    String beautiful = "beautiful bird";
    public void beautiful(){
        System.out.println("tne parrot is" + beautiful +"in beautiful bird");
    }
}