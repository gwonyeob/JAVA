package Method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkage(10);
        checkage(20);

    }

    public static void checkage(int age) {
        if( age < 18) {
            System.out.println(age + "살, 미상년자는 출입이 불가합니다.");
        } else {
            System.out.println(age +"살, 입장하세요.");
        }
    }
}
