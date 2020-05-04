package day33_CustomClass;

public class A12_CapitalOne {
    public static void main(String[] args) {
        A11_BankAccount Anna = new A11_BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.checkingBalance();
        Anna.deposit(33);

        Anna.checkingBalance();

        Anna.withDraw(13);

        Anna.checkingBalance();

        Anna.withDraw(30);

        Anna.checkingBalance();

        Anna.withDraw(1000);

        Anna.checkingBalance();

        System.out.println("==================================================");

        System.out.println( Anna );














    }

}