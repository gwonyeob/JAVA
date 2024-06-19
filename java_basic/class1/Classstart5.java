package java_basic.class1;

public class Classstart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[]{student1, student2};
        //new Student[]도 생략 가능
        for(int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        //Student s = students[i] 이렇게 해서 변수 길이를 줄일 수 있음
    }
}
