package com.company;
//think needs to be example.java
//unable to establish link between Main, BankAccount, Savings and Checking Aocount then to setup withdrawal/deposit balance.
// Confused thought maybe java.fx may have been needed instead
//this delay prevented me from attempting Overdraft.

import com.CheckingAccount;
import com.SavingsAccount;

public class Main {

    public static void main(String[] args) {
	//create a parent 'Bank Account' class that has a 'Balance' that will be a public
        //    //All Bank accounts should be able to 'Withdraw' and 'Deposit'.
        //    // Withdraws and Deposits can affect the Balance,
        //    //but should provide an update printed on the screen,
        //    //with how much has been deposited or withdrawn from the account, as well as the new balance.
        //    //Now create two new bank accounts that inherit (extend) from the main Bank Account class,
        //    // entitled 'Savings Account' and 'Checking Account'.
        //    //With the Savings Account, No Overdraft
        //    // users should not be able to withdraw more money than they have in the account.
        //    //should be a method on this class entitled 'Compound Interest',
        //    // which accepts an 'Interest' argument that when ran,
        //    // adds the interest onto the current balance while providing an update printed on the screen.
        //    //Checking Account, users will be able to deduct more funds than they have available,
        //    // but should be charged an 'Overdraft Fee', which should be a constant provided in the class.
        //    //update printed to the screen, letting the user know that they have over drafted.
        //    //create two new accounts (one Savings and one Checking) and deposit $500 into each account.
        //    //Try to deduct $550 from the Savings account, then compound 6% interest to the account.
        //    // Then with the Checking account, deduct $550 from the account.
        //    //Helpful Guide: Animal=bank account; Cat = checking account; Dog = savings account
        //    //@Override Speak =@ Override Withdraw
        SavingsAccount = new SavingsAccount();
        SavingsAccount.deposit(500.00);
        CheckingAccount = new CheckingAccount();
        CheckingAccount.deposit(500.00);


        System.out.println(SavingsAccount.getBalance());
        System.out.println(CheckingAccount.getBalance());
    }

}
