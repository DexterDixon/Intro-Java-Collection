/*
Homework 6
Dexter Dixon
Due:03/25/2021
This is a class file with methods that enable BankApplication.java
 */
public class BankAccount {
    
    private int nAccountNumber = 0;
    private int nNextAccountNumber = 1;
    private double dBalance = 0.0;
    private double dMonthlyInterestRate =0.0;
    
    BankAccount() {
       nAccountNumber = nNextAccountNumber;
       nNextAccountNumber += 1;
       dBalance = 0;
       dMonthlyInterestRate = 0;
    }//end constructor
    
    BankAccount(double dStartBalance, double dIntRate) {
       nAccountNumber = nNextAccountNumber;
       nNextAccountNumber += 1;
       dBalance = dBalance;
       dMonthlyInterestRate = dMonthlyInterestRate;
    }//end overload constructor
    public int getAccountNumber() {
        return nAccountNumber; //return account number
    }//end method
    
    public double getBalance() {
        return dBalance; //return balance
    }//end method
    
    public double getMonthlyInterestRate() {
        return dMonthlyInterestRate; //return interest rate
    }//end method
    
    public void setMonthlyInterestRate(double dRate) {
        dMonthlyInterestRate = dRate; //return monthly interest
    }//end method
    
    public int getNextAccountNumber() {
        return nNextAccountNumber; //return account number
    }//end method
    
    public void printBankInfo() {
        System.out.println("Account Number: " + nAccountNumber);
        System.out.println("Balance: " + dBalance);
        System.out.println("Monthly Interest: " + monthlyInterest());
    }//end method
    
    public void makeDeposit(double dDepositAmt) {
        dBalance += dDepositAmt; //perform a deposit
    }//end method
    
    public void makeWithdrawal(double dWithdrawalAmt) {
        dBalance -= dWithdrawalAmt; //perform a withdrawal
    }//end method
    
    public double monthlyInterest() {
        return dBalance*dMonthlyInterestRate/100; //return the monthly intrest variable
    }//end method
}//end class
