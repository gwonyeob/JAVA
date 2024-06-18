package Method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: "+sum1);

        int sum2 = add(10, 20);
        System.out.println("결과2 출력: "+sum2);
    }
    //add method(메서드 이름, 반환 타입, 매개변수(파라미터)->변수)
    public static int add(int a, int b) {
        System.out.println(a +"+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
