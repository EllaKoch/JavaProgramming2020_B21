package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {
    // attributes
    public String accountName;
    public String accountNumber;
    public double availableBalance = 0;

    // method to  set info
    public void setInfo(String acctName, String accNumber) {
        accountName = acctName;
        accountNumber = accNumber;

    }

    // method to print info
    public void getInfo() {
        System.out.println("=============================================");
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + availableBalance);
        System.out.println("=============================================");
    }

    // deposit action
    public void deposit(double amount) {
        System.out.println("Amount of money deposited: " + amount);
        availableBalance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("Amount of money withdrawn: " + amount);
        availableBalance -= amount;
    }

    public void showBalance() {

        System.out.println("As of today " + LocalDate.now() + ", " + accountName + " available balance is: $" + availableBalance);
    }


}
