package com.company;

//import com.CheckingAccount;
//import com.SavingsAccount;

//probably needed .example.java
//public class BankAccount = Animal//
public class BankAccount {

    //int balance;
    //int balance = animal weight?

    //public int getBalance() {
       // return balance;
        //this.balance();
        //autofilled not sure if needed or how related?
        //trying to setup with withdrawal/deposit
    }

    public static void main (String[] args){
        //Create Savings Account
        SavingsAccount = new Account();
        SavingsAccount.deposit(500.00);

        CheckingAccount = new Account();
        CheckingAccount.deposit(500.00);

        System.out.println(SavingsAccount.getBalance());
        System.out.println(CheckingAccount.getBalance());

    }

}

