import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;


    @Before
    public void before() {
    library = new Library();
    book = new Book();
    }

    @Test
    public void bookCount(){
        assertEquals(0, library.bookCount());

    }
    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());

    }
//    if book count is less than capacity then add book
    @Test
    public void checkCapacity(){
        library.addBookIfCapacity(book);
        assertEquals(1, library.bookCount());

    }

}
