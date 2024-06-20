package java_basic.oop1;

public class music_player_main2 {
    public static void main(String[] args) {
        int volume = 0;
        boolean onoff = false;
        music_player_data data = new music_player_data();

        //음악 플레이어 켜기
        data.onoff = true;
        System.out.println("음악 플레이어 불륨: " + data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        System.out.println("음악 플레이어 상태 확인:");
        if(data.onoff) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.onoff = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
//음악플레이어 class를 만들고 이 클래스를 사용하도록 기존 로직을 변경함
//->다양한 변수가 추가되어도 음악 플에이어와 관련된 변수는 클래스를 통해 구분 가능
