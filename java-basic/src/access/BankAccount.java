package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if(isAccountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAccountValid(amount) && balance-amount>=0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance(){
        return balance;
    }

    private boolean isAccountValid(int amount) {
        // 금액이 0보다 크다
        return amount>0;
    }

}
