package Method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changenumber 호출 전, number: " + number);
        changenumber(number);
        System.out.println("4. changenumber 변경 전, number: " + number);
    }
    public static void changenumber(int number) {
        System.out.println("2. changenumber 변경 전, number: " + number);
        number *= 2;
        System.out.println("3. changenumber 변경 전, number: " + number);
    }

}
