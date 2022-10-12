package com.jordan.Example3;

public class Bank {
    int balance = 0;
    public void deposit(double amount, double balance) {
        double newBalance = amount + balance;
        System.out.println("Your new balance is $" + newBalance);
    }

    public void withdrawal(double amount, double balance) {
        double newBalance = balance - amount;
        if(newBalance > 0) {
            System.out.println("Your new balance is $" + newBalance);
        } else if ( newBalance == 0){
            System.out.println("Your new blance is 0. Please add more funds to this account within 5 business days or your account will be closed.");
        } else {
            System.out.println("Insufficent funds. Unable to process your request.");
        }
    }

    public static void main (String [] args){
        Bank Johnny = new Bank();
        Johnny.deposit(500.00, 10000.00);
        Johnny.withdrawal(15000.00, 100000.00);
    }

}
