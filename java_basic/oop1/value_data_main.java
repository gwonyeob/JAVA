package java_basic.oop1;

public class value_data_main {
    public static void main(String[] args) {
        valuedata value_data = new valuedata();
        add(value_data);
        add(value_data);
        add(value_data);
        System.out.println("최종 숫자 = " + value_data.value);

    }

    static void add(valuedata value_data) {
        value_data.value++;
        System.out.println("숫자 증가 value " + value_data.value);
    }
}
