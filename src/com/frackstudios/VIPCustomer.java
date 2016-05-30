package com.frackstudios;

/**
 * Created by CrypticDev on 1/31/2016.
 */
public class VIPCustomer {
    private String customerName;
    private double creditLimit;
    private String eMail;

    public VIPCustomer() {
        this("Default name", 500.00, "default@mail.com");
    }

    public VIPCustomer(String customerName, String eMail) {
        this(customerName, 500.00, eMail);
    }

    public VIPCustomer(String customerName, double creditLimit, String eMail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.eMail = eMail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMail() {
        return eMail;
    }
}
