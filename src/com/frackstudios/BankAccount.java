package com.frackstudios;

/**
 * Created by CrypticDev on 1/31/2016.
 */
public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {

        this("500358-25", 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Main constructor called.");

    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail,
                       String customerPhone) {
        System.out.println("Class constructor with parameters called");
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerPhone, String customerEmail, String customerName) {
        this("9999999", 100.55, customerPhone, customerEmail, customerName);
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New account balance is " +
                this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. Transaction not processed.");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " +
                    this.accountBalance);
        }
    }



    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /*public  void checkBalance(double accountBalance) {
        if (this.getCustomerName() != this.getCustomerName()) {
            return;
        }

        if (this.accountNumber != this.accountNumber){
            return;
        }

        accountBalance = this.accountBalance;

        if (this.accountBalance <= 0)
            return;

        this.accountBalance = accountBalance;

    }*/
}
