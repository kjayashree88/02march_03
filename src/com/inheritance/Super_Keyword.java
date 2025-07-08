package com.inheritance;

public class Super_Keyword {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.display();
    }
    }
    class  Father{
    public void show(){
        int property = 4;
        System.out.println("the size of the property is" + property);
    }
    }
class  Daughter extends Father{
    int property = 9;
    public void display(){
        System.out.println("i am daughter class");
        

    }
}