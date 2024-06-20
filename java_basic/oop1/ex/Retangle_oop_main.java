package java_basic.oop1.ex;

public class Retangle_oop_main {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        retangle.width = 5;
        retangle.height = 8;

        int area = retangle.area();
        System.out.println("넓이: " + area);

        int perimeter = retangle.perimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = retangle.square();
        System.out.println("정사각형 여부: " + square);
    }
}
