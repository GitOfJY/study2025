package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("입금 완료");
    }

    void withdraw(int amount){
        if (balance < amount){
            System.out.println("잔액 부족");
            return;
        } else {
            balance = balance - amount;
            System.out.println("출금 완료");
        }
    }
}
