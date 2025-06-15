package com.branching;

public class Return_Keyword {
    public static void print() {

        System.out.println("printed");
    }

       public static  void  checkage(int age) {
           if (age > 18) {
               System.out.println("eligible");
               return;
           }
           System.out.println("not eligible");
       }
           public static void main(String[] args) {
        print();
        checkage(45);
        checkage(12);



           }
       }


