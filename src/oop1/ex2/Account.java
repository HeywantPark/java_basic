package oop1.ex2;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }
    void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("출금 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
    }
    void printBalance() {
        System.out.println("현재 잔고는 : " + balance);
    }
}
