package Method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 ==1) {
            return true;
        } else {
            return false;
        }
    }
}
// 짝홀 판별 홀수 -> false 짝수 -> true