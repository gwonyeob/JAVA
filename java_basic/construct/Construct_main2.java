package java_basic.construct;

public class Construct_main2 {
    public static void main(String[] args) {
        Member_construct member1 = new Member_construct("user1", 15, 90);
        Member_construct member2 = new Member_construct("user2", 16);

        Member_construct[] members = {member1, member2};

        for (Member_construct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
//생성자 장점
//1. 중복 호출 제거 -> 매서드를 다시 호출할 필요가 없음
//2. 생성자 호출 필수 -> 기존: 개발자가 실수로 호출 안함(데이터가 없어도 프로그램이 돌아감)
//*생성자 사용: 호출하지 않으면 컴파일 오류가 발생하여 프로그램이 아예 안 돌아감 ->필수값 보장 가능

