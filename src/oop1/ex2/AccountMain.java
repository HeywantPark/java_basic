package oop1.ex2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(100);
        account.deposit(200);
        account.withdraw(400);
        account.printBalance();
    }
}
