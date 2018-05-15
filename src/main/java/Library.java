import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;

    public Library() {
        this.book = new ArrayList<>();
        this.capacity = 100;
    }

    public int bookCount(){
        return this.book.size();
    }
    public void addBook(Book book){
        this.book.add(book);
    }

    public void addBookIfCapacity(Book book){
        if (bookCount()< this.capacity);
        this.book.add(book);
    }
}
