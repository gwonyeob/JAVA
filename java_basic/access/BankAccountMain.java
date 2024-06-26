package java_basic.access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withDraw(3000);
        System.out.println("balance = "  + account.getBalance());;
    }
}//접근 제어자&캽슐화 -> 데이터를 안전하게 보호 / 해당 기능을 사용하는 복잡도 낮춤