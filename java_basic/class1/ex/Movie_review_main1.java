package java_basic.class1.ex;

public class Movie_review_main1 {
    public static void main(String[] args) {
        Movie_review inception = new Movie_review();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        Movie_review abouttime = new Movie_review();
        abouttime.title = "어바웃 타임";
        abouttime.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + inception.title + " 리뷰: " + inception.review);
        System.out.println("영화 제목: " + abouttime.title + " 리뷰: " + abouttime.review);



    }
}
