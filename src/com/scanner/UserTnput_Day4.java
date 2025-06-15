package com.scanner;

import java.util.Scanner;

public class UserTnput_Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("name entered :" + name);
         System.out.println("enter your name");
     //    String name1 = scan.next();
      //  System.out.println("name entered : " + name1);
      //  System.out.println("enter your age");
      //  byte age = scan.nextByte();
      //  System.out.println("age entered :" + age);

        scan.close();
    }

    }
