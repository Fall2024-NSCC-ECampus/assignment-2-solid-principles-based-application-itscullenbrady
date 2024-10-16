public class Review {
    private String feedback;
    private int rating;

    public Review(String feedback, int rating) {
        this.feedback = feedback;
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public int getRating() {
        return rating;
    }
}
