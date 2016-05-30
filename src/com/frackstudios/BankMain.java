package com.frackstudios;

/**
 * Created by CrypticDev on 1/31/2016.
 */
public class BankMain {
    public static void main(String[] args) {
        VIPCustomer mary = new VIPCustomer();

        System.out.println("Default credit limit is " + mary.getCreditLimit());

        VIPCustomer kathy = new VIPCustomer("Kathy Newman", 1500.00, "kathy@email.com");

        System.out.println("New customer information is " + "(Customer Name: " + kathy.getCustomerName() +
        ", Credit Limit: " + kathy.getCreditLimit() + ", Customer eMail: " + kathy.geteMail() + ")");

        VIPCustomer bobM = new VIPCustomer("Bob Mills", "bobmills@email.com");

        System.out.println("Customers Name: " + bobM.getCustomerName() + ", Customers eMail: " + bobM.geteMail() +
                ", Defaulted Credit Limit: " + bobM.getCreditLimit() );


        System.out.println("************ Ignore Below ****************");


        BankAccount bobsAccount = new BankAccount();

        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);

        bobsAccount.withdrawal(80.0);

        BankAccount timsAccount = new BankAccount("Tim", "tim@crypticdev.xyz", "(103)520-1337");
        System.out.println(timsAccount.getAccountNumber() + " Name: " + timsAccount.getCustomerName());
    }
}
