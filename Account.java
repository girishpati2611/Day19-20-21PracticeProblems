package com.bridglabz.oops;

class AccountAmmounts {
    double Totalbalance ;
    double creditAmount;
    double debitAmount;

    public AccountAmmounts(double totalbalance, double creditAmount, double debitAmount) {
        Totalbalance = totalbalance;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
    }
    public void creditMoney(double creditAmount) {
        System.out.println("Your acccount balance is "+Totalbalance +" Rs.");
        Totalbalance += creditAmount;
        System.out.println("You have credited "+creditAmount+" Rs.");
        System.out.println("Total amount in account is "+Totalbalance+ " Rs.");
    }
    public void debitMoney(double debitAmount) {
        if (Totalbalance < debitAmount) {
            System.out.println("Your Account balance is low.You can not debit the money.");
            System.out.println("Total balance is " + Totalbalance + " Rs.");
            debitAmount=0.0;
        } else {
            Totalbalance -= debitAmount;
            System.out.println("You have debited " + debitAmount + " Rs.");
            System.out.println("Your current balance is " + Totalbalance + " Rs.");
        }
    }
}

public class Account {

    public static void main(String[] args) {
        AccountAmmounts obj = new AccountAmmounts(1000, 1500, 2000);
        obj.creditMoney(obj.creditAmount);
        obj.debitMoney(obj.debitAmount);
    }
}

