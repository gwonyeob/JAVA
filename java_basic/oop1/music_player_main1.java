package java_basic.oop1;

public class music_player_main1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean onoff = false;

        //음악 플레이어 켜기
        onoff = true;
        System.out.println("음악 플레이어 불륨: " + volume);

        volume++;
        System.out.println("음악 플레이어 볼륨: " +volume);

        volume--;
        System.out.println("음악 플레이어 볼륨: " +volume);

        System.out.println("음악 플레이어 상태 확인:");
        if(onoff) {
            System.out.println("음악 플레이어 ON, 볼륨: " +volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        onoff = false;
        System.out.println("음악 플레이어를 종료합니다.");
        ;
    }

}
