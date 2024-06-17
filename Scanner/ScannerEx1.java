package Scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine(); //이름 입력받기

        System.out.print("당신의 나이를 입력하세요ㅣ ");
        int age = scanner.nextInt(); //나이 입력받기(정수형)

        System.out.println("당신의 이름은 " + name + "이고 " + age + "살입니다.");


    }
}
