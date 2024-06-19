package java_basic.ref;

public class Method1 {
    public static void main(String[] args) {
        Student_hub student1 = createstudent("학생1",15, 90);
        Student_hub student2 = createstudent("학생2",16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student_hub createstudent(String name, int age, int grade) {
        Student_hub student = new Student_hub(); //x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001 참조값 던져주기

    }
    /*static void initStudent(Student_hub student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    } */
    //초기화가 안되서 student2의 값이 NULL로 출력됨

    //출력
    static void printStudent(Student_hub student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
