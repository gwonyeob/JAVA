package Method;

public class overloading2 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.7));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
//매서드의 매개변수 타입이 다르기 떄문에 이름이 같아도 정상적으로 컴파일 되는 모습
