import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {

    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books;

    public User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay); // Format: YYYY-MM-DD
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthDay.toString();
    }

    public void borrow(Book book) {
        books.add(book);
    }

    public int age() {
        return Period.between(birthDay, LocalDate.now()).getYears();
    }



   public  String borrowedBooks(){
       return this.books.toString();

        }
    }

