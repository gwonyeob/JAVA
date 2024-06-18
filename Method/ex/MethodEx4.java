package Method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        int amount = 0;
        while(true) {
            System.out.println("----------------------------------------");
            System.out.println("1. 입금 ㅣ 2. 출금 ㅣ 3. 잔액 확인 ㅣ 4. 종료");
            System.out.println("----------------------------------------");
            System.out.print("선택: ");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.println("입금액을 입력하세요: ");
                amount = input.nextInt();
                balance = deposit(balance, amount);

            } else if (choice == 2) {
                System.out.println("출금액을 입력하세요: ");
                amount = input.nextInt();
                balance = withdraw(balance, amount);

            } else if (choice == 3) {
                balance = checkbalance(balance);

            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }

        }

    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static int checkbalance(int balance) {
        System.out.println("현재 잔액: " +balance + "원");
        return balance;
    }
}

// 넣어야 되는 요소
//1. 입력(scanner) 2. 함수 3개 입금, 출금, 잔액 확인 / 종료는 else -> break 3.while(ture) ->종료 입력시 break