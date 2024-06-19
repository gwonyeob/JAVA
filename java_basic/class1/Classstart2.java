package java_basic.class1;

public class Classstart2 {
    public static void main(String[] args) {
        String[] studentname = {"학생1", "학생2"};
        int[] studentage = {15, 16};
        int[] studentgrade = {90, 80};

        for(int i =0; i<2; i++) {
            System.out.println("이름: " + studentname[i] + " 나이: " +   studentage[i] + " 성적: " + studentgrade[i] );
        }
    }
}
