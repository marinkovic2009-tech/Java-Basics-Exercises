public class Ebook extends Book {
    private String format;


    Ebook(String title, String author,int pageCount, String format) {
        this.format = format;
        super(title, author,pageCount);
    }
}

