package Method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printnumber(number); //int -> double 자동 형변환
    }

    public static void printnumber(double n) {
        System.out.println("숫자: " +n);
    }
}
