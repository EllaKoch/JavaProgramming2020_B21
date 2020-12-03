package day35_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Elvira Kochkarova", "124567878");

        account1.getInfo();

        account1.deposit(100);// available 100.0

        account1.withdraw(80);// 20 left

        account1.deposit(100000);
        account1.showBalance();

        BankAccount account2 = new BankAccount();

        account2.setInfo("Walid", "7654345645");

        account2.deposit(200);

        account2.getInfo();
        account2.showBalance();

        account1.deposit(3000);
        account1.withdraw(50000);
        account1.withdraw(3000);


        account1.showBalance();
        account2.showBalance();


    }
}
