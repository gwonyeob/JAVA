package java_basic.access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량이 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량이 10 감소합니다.");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
//private 접근 제어자는 모든 외부 호출을 막음
//->private가 붙은 경우 해당 클래스 내부에서만 호출 가능
//접근 제어자 종류
//1. public 2. protected 3. default 4. private