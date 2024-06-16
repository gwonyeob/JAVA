package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if(true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        System.out.println("if m = " + m);
        // System.out.println("if x = " + x);
    }
}
//지역변수 x는 if문 안에서만 살아있기 때문에 출력 오류남