package java_basic.class1;

public class Classstart3 {

    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 수 있는 변수 선언
        student1 = new Student();
        student1.name = "학생1"; //class는 x.y로 접근 가능
        student1.age = 10;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " +student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " +student2.grade);

    }

}
//참조값 확인 -> System.out.println(student1);
//객체는 클래스에서 정의한 속성과 가능을 가진 실체
//student1은 학생1의 속성, student2는 학생2의 속성 ->같은 클래스, 서로 다른 객체
//인스턴스: 특정 클래스로부터 생성된 객체
// ex) student1 객체는 Student 클래스의 인스턴스다
//인스턴스가 객체보다 관계에 더 초점을 두지만 둘다 클래스에서 나온 실체라는 핵심 의미는 같음
