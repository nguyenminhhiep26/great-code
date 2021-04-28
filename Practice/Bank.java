package De_Thi_ADF;

import task8.java.B;

import java.util.Scanner;

public class Bank {
    protected double balance;
    protected  double rate;
    protected   double interest;

    public Bank(){}

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest()
    {
        interest = balance * (rate/1200);
        return interest;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }


}
