package Method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        printnumber((int)number); //명시적 형변환을 사용해서 출력
    }

    public static void printnumber(int n) {
        System.out.println("숫자: " + n);
    }
}
