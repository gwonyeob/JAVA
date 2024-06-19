package java_basic.ref;

public class init_main {
    public static void main(String[] args) {
        Init_data data = new Init_data();
        System.out.println("value1 = " +data.value1);
        System.out.println("value2 = " +data.value2);
    }
}
//value1: 초기값 지정 x -> 멤버 변수는 자동 초기화되기 때문에 숫자 0 초기화
//value2: 10으로 초기값 지정 -> 10으로 초기화됨

//맴버 변수: 자동 초기화(선언위치: 클래스 영역) ->클래스 변수 / 인스턴스 변수
//ex)static int high = 200 -> 2미터의 키가 모든 객체에 적용(클래스 변수), String haircolor 값 고정 x -> 각 객체마다 다른 값 가능(인스턴스 변수)
//ex) 숫자 = 0, boolean = false, 참조형 = null(참조할 대상이 없다는 뜻)
//지역 변수: 수동 초기화 ->직접 해줘야됨(선언위치ㅣ 메서드나 생성자 내부)