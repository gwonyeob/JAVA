package Method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " +add(1,2,3));
    }

    public static  int add(int a, int b) {
        System.out.println("1번 호출");
        return a+b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a+b+c;
    }
}
//매서드 오버로딩 -> 과적
//오버로딩 규칙
//* 매서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩 가능 / 반환 타입은 인정 x ex) int add(int a, int b)와 double int(int a, int b)는 컴파일 오류남
//매서드 시그니처 = 매서드 이름 + 매개변수 타입(순서)
//본 예제의 경우 매개변수 타입이 다르기 때문에 컴파일이 정상적으로 실행됨
