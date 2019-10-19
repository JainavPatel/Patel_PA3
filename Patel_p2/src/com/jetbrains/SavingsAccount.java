package com.jetbrains;

public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount (double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double[] calculateMonthlySavings (int monthsInYear){
        double[] monthlySavings = new double[monthsInYear];
        double monthly;
        int i;
        for(i = 0; i < monthsInYear; i++){
            monthly = (double)(this.savingsBalance * annualInterestRate / 12);
            this.savingsBalance = this.savingsBalance + monthly;
            monthlySavings[i] = this.savingsBalance;
        }
        return monthlySavings;
    }
    public static void modifyInterestRate (double newInterestRate){
        annualInterestRate = newInterestRate;
    }
    public void calculateMonthlyInterest(){
        double monthly;
        monthly = (this.savingsBalance * annualInterestRate / 12);
        this.savingsBalance = this.savingsBalance + monthly;
    }

}