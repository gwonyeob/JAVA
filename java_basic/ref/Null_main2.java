package java_basic.ref;

public class Null_main2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생
        //->참조할 객체 인스턴스가 존재 x
        System.out.println("data = " + data.value);
    }
}
