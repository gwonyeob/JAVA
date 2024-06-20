package java_basic.oop1;

public class musicplayer {

    int volume = 0;
    boolean on = false;

    void on() {
        on = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        on = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void up() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void down() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void show_status() {
        if (on) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
