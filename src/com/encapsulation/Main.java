package com.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
      //  ba.accoNo = 9856;
      //  ba.balance = 546;

        //ba.details();
        ba.setBalance(456.52d);
        System.out.println(ba.getBalance());
    }
    }
    class  BankAccount{
    int accoNo = 562895889;
    private double balance = 4585.000;
    String IFSC = "CBINOO2525";
    public void details(){
        System.out.println("my bank details are" + accoNo +" " + IFSC + " " +balance);

    }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
