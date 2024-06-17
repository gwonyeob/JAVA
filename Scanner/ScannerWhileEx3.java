package Scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int i = 0;
        int sum = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while(true) {
            num = input.nextInt();
            if(num==-1) {
                break;
            }
            sum += num;
            i++;
        }
        double avg = (double) sum / i;
        System.out.println("입렭한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: " +avg);
    }
}

// while((input = input.nextInt()) != -1) 이렇게 하는 것도 가능
