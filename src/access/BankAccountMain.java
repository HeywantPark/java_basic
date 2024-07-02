package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(50000);
        account.withdraw(3000);
        System.out.println("현재 잔고는 : " + account.getBalance());
    }
}
