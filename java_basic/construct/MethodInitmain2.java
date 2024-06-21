package java_basic.construct;

public class MethodInitmain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initmember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initmember(member2, "uesr2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +s.grade);
        }
    }

    static void initmember (MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.name = name;
    }
}//맨 앞 참조값 받아올 곳
//매서드를 사용해서 반복을 제거함 -> 이 매서드는 대부분 객체의 맴버 변수를 사용함
//객체 지향 -> MemberInit이 자기 자신의 데이터를 변경하는 기능을 제공하는 것이 좋음