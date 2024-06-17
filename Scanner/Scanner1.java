package Scanner;

import java.util.Scanner;
//scanner 호출
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine();
        //입력을 문자열로 가져오기(엔터를 입력할때까지
        System.out.println("입력한 문자열: " +str);

    }
}
/*c언어와 다르게 입력받을때 입력받는 타입에 따라 다르게 압력받아야함
* println()으로 해야 다음 줄로 넘어감*/