package java_basic.construct;

public class MethodInitmain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initmember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initmember("uesr2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
//매개변수의 이름과 맴버 변수의 이름이 같은 경우 this를 사용하여 구분해야됨 -> this를 없애면 둘다 매개변수를 뜻하게 되서 맴버변수의 값이 변경되지 않음
//this는 인스턴스 자신을 가리킨다.
//옛날에는 구분을 쉽게 할려고 필요없어도 썼지만 이제 ide에서 변수에 따라 색깔을 다르게 표시해서 굳이? 쓸 필요가 없음
