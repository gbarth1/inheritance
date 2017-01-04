package com.company;

/**
 * Created by gb647 on 1/4/17.
 */
public class SavingsAccount extends BankAccount
{
    public SavingsAccount(double amount, double rate)
    {
        //super talks to the super class - BankAccount, calls the superclass's constructor
        super(amount);
        interestRate = rate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    private double interestRate;
}
