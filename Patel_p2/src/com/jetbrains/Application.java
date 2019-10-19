package com.jetbrains;

public class Application {
    public Application(){

    }
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        double [] monthCount = saver1.calculateMonthlySavings(12);
        System.out.println("Saver 1 Below.\n");
        int i;
        for (i = 0; i < 12; i++){
            System.out.printf("Month %d: \tSaver 1 balance = \t %.2f \twith rate of 4 percent\n", i+1,monthCount[i]);
        }
        monthCount = saver2.calculateMonthlySavings(12);
        System.out.println("\nSaver 2 Below.\n");
        for(i = 0; i < 12; i++){
            System.out.printf("Month %d: \tSaver 2 balance = \t %.2f \twith rate of 4 percent\n",i+1,monthCount[i]);
        }
        System.out.println("\nannualInterestRate change to 5% Below.\n");
        SavingsAccount.modifyInterestRate(0.05);
        monthCount = saver1.calculateMonthlySavings(13);
        for (i = 12; i < 13; i++) {
            System.out.printf("Month %d: \tSaver 1 balance = \t %.2f \twith rate of 5 percent\n", i+1,monthCount[i]);
        }
        monthCount = saver2.calculateMonthlySavings(13);
        for (i = 12; i < 13; i++) {
            System.out.printf("Month %d: \tSaver 2 balance = \t %.2f \twith rate of 5 percent\n",i+1,monthCount[i]);
        }
    }
}
