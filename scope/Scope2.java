package scope;

public class Scope2 {
    public static void main(String[] args){
        int m=10;
        for(int i=1; i<2; i++) {
            System.out.println("for M = " +m);
            System.out.println("for i = " +i);
        }
        System.out.println("for M = " +m);
        //System.out.println("for i = " +i);
    }
}
