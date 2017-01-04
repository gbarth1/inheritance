package com.company;

/**
 * Created by gb647 on 1/4/17.
 */
public class BankAccount
{
    public BankAccount(double amt)
    {
        balance = amt;
    }

    public double getBalance()
    {
        return balance;
    }


    public void deposit(double d)
    {
        double dep= balance - d;
    }

    private double balance;
}
