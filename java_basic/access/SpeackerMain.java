package java_basic.access;

public class SpeackerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        //월드에 직접 접근
        System.out.println("volume 월드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
//volumeUp 매서드에 음량이 100을 넘지 못하도록 제ㅇ한했지만 volume 필드에 직접 접근하면 답 x
//->근본적인 해결책: volume 필드의 외부 접근을 막아야 함
