package java_basic.ref;

public class Null_main1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
//자바는 c언어와 달리 아무도 참조하지 않는 인스턴스가 있으면 JYM의 GC가
//더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해줌