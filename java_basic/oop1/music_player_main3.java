package java_basic.oop1;

public class music_player_main3 {
    public static void main(String[] args) {
        int volume = 0;
        boolean onoff = false;
        music_player_data data = new music_player_data();


    }

    static void on(music_player_data data) {
        data.onoff = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(music_player_data data) {
        data.onoff = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void up(music_player_data data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void down(music_player_data data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void check(music_player_data data) {
        if (data.onoff) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
//모듈화의 장점
//1. 중복 제거 2. 변경 영향 범위(해당 매서드 내부만 변경하면 됨 3. 매서드 이름 추가
//절차 지향 프로그래밍의 한계 ->데이터와 기능이 분리되어 있음

