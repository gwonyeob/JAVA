package java_basic.ref;

public class Methodchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = " +dataA.value);
        changereference(dataA);
        System.out.println("매서드 호출 후: dataA.value = " +dataA.value);

    }
    public static void changereference(Data datax) {
        datax.value = 20;
    }
}
//자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입하는 데 변수 dataA는 참조값 x001을
//가지고 있으므로 참조값을 복사해서 전달함 -> dataA, dataX 둘다 같은 참조값이 x001을 가짐
//->dataX를 통해서도 x001에 있는 Data 인스턴스에 접근 가능