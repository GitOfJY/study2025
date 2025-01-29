package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview mov1 = new MovieReview();
        mov1.title = "인셉션";
        mov1.review = "인생은 무한 루프";

        MovieReview mov2 = new MovieReview();
        mov2.title = "어바웃타임";
        mov2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {mov1, mov2};

        for (MovieReview mr : movieReviews) {
            System.out.println("영화제목: "+mr.title+", 리뷰: "+mr.review);
        }

    }

}
