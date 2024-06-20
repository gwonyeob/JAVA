package java_basic.oop1.ex;

public class Retangle {
    int width = 0;
    int height = 0;

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    boolean square() {
        return width == height;
    }
}
