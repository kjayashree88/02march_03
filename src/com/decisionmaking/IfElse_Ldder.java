package com.decisionmaking;
import java.util.Scanner;


public class IfElse_Ldder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = s.nextInt();
        if (age>=0 && age<=5) {
            System.out.println("baby");
        }
            else if (age>5 && age<=19) {
            System.out.println("child");

        }
                else{
                    System.out.println("adult");


        }


    }

    }
