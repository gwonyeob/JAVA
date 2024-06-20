package java_basic.oop1;

public class music_player_main4 {
    public static void main(String[] args) {
        musicplayer player = new musicplayer();

        player.on();
        player.off();
        player.up();
        player.down();
        player.show_status();

    }
}
//캡슐화 ->ㅅ속성과 기능을 하나로 묶어서 필요한 기능을 매서드를 통해 외부에 제공하는 것
