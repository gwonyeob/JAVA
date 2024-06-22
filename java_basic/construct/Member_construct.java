package java_basic.construct;

public class Member_construct {
    String name;
    int age;
    int grade;
    //추가
    Member_construct(String name, int age) {
        this(name, age, 50); //변경 가능
        /*this.name = name;
        this.age = age;
        this.grade = 50; */
    }

    Member_construct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //생성자와 매서드의 차이점
    //생성자의 이름은 클래스 이름과 같아야 함 ->첫글자 대문자 시작
    //생성자는 반환 타입이 없음 -> 비워둬야 함
    //this() -> 생성자 코드의 첫줄에만 사용 가능
}
