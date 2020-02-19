import java.awt.*;

public class ReviewDriver {
    public static void main(String[]args){
        System.out.println(Review.sentimentVal("monster"));
        System.out.println(Review.sentimentVal("power"));
        System.out.println(Review.sentimentVal("universe"));
        System.out.println(Review.totalSentiment("26WestReview.txt"));
    }
}
