package java_basic.construct;

public class MemberDefault_main1 {
    public static void main(String[] args) {
        Member_default member = new Member_default("나권엽");
    }
}
//기본 생성자는 자동으로 만들어짐
//1. 생성자는 반드시 호출되어야 함 2. 생성자가 없으면 기본 생성자가 제공됨
//3. 생성자가 하나라도 있으면 기본 생성자가 제공 X -> 개발자가 정의한 생성자 직접 호출

