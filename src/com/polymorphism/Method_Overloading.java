package com.polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.subtraction(45,9,3));
        System.out.println(s.subtraction(45.9,33.9));
        System.out.println(s.subtraction(56,9));
        Student d = new Student();
        d.print ("java",2);
        d.print("jaya",8);


    }
}
class Sub{
    public int subtraction(int a, int b){
        return a-b;
    }
    public  int subtraction(int a,int b,int c){
        return (a-b)-c;
    }
    public double subtraction(double a,double b){
        return a-b;
    }
}
class Student{
    int id = 8;
    String name ="besant";
    public void print(String name,int id){
        System.out.println(name + " " + id);

    }
}