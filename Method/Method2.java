package Method;

public class Method2 {
    public static void main(String[] args) {
        printheader();
        printfooter();
    }
    public static void printheader() {
        System.out.println(" = 프로그램을 시작합니다 = ");
        return;
    }
    public static void printfooter() {
        System.out.println(" = 프로그램을 종료합니다 = ");
        return; // 반환타입이 void인 경우 생략 가능
    }
}
/*매개변수가 없는 경우
1. 선언: 매개변수를 비워두고 정의 2. 호출 변수 비워두고 하기*/
// 반환 타입이 없는 경우
//1. 선언: 반환 타입 -> void 2. 반환 타입이 void이기 때문에 반환값을 받으면 컴파일 오류가 발생함