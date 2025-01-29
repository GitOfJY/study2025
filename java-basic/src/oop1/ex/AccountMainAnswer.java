package oop1.ex;

public class AccountMainAnswer {
    public static void main(String[] args) {
        AccountAnswer account = new AccountAnswer();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고 : "+account.balance);

    }
}
