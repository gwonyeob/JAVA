package java_basic.ref;

public class Methodchange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("매서드 호출 전: a = " +a);
        changeprimitive(a);
        System.out.println("매서드 호출 후: a = " +a);
    }

    static void changeprimitive(int x) {
        x = 20;
    }
}
// 매서드가 종료되면 매개변수 x는 제거되기 때문에 a가 20으로 출력되지 않고 10으로 출력됨
