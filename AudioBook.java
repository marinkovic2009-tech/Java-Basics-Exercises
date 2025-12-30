public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String author, int runTime) {
        this.runTime = runTime;
        super(title, author, 0);
    }

}
