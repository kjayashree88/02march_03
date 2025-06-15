package com.decisionmaking;
import java.util.Scanner;
public class If_Example{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your age");
         int age = s.nextInt();
         if (age>= 18){
             System.out.println("eligible to vote");
         }
 if (age>17){
     System.out.println("eligible to vote");
 }else{
     System.out.println("not eligible to vote");

 }

    }

    }


