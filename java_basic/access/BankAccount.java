package java_basic.access;

public class BankAccount {

    private int balance;


    public BankAccount() {
        balance = 0;
    }
    //public 매서드 만들기
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount ;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withDraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
    //잔액이 0보다 크다면 정상적인 값으로 인증

}
