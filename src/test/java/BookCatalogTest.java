import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;
    @BeforeEach
    void setUp() {
        bc = new BookCatalog();
    }

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book book = new Book(1, "Learning Java", "", "", "", 0);

        bc.addBook(book);

        assertSame(book, bc.getBookArray()[0]);
    }

    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
        Book book = new Book(1, "Learning Java", "", "", "", 0);

        bc.addBook(book);
        assertSame(book, bc.findBook("Learning Java"));
    }

    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book book = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book);
        assertSame(book, bc.findBook("LeArNinG JAvA"));
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book book = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book);

        assertSame(book, bc.findBook("   Learning Java   "));
    }

    //G
    @Test
    public void shouldThrowExceptionWhenCatalogIsEmpty() throws BookNotFoundException {
		BookCatalog catalog = new BookCatalog();

		assertThrows(BookNotFoundException.class, () -> bc.findBook("Learning Java"));
    }



}
