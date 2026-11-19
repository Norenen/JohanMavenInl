import org.junit.jupiter.api.Test;
import models.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(1, "Learning Java", "", "", "", 0);

        assertEquals(book1, book2);
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(2, "Clean Code", "", "", "", 0);

        assertNotEquals(book1, book2);
    }

    //G
    @Test
    void booksWithSameIdAndTitleShouldBeEqual() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(1, "Learning Java", "", "", "", 0);

        assertEquals(book1, book2);

    }

    //G
    @Test
    void booksWithDifferentIdsShouldNotBeEqual() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(2, "Learning Java", "", "", "", 0);

        assertNotEquals(book1, book2);

    }


    //G
    @Test
    void booksWithSameIdButDifferentTitlesShouldNotBeEqual() {
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        Book book2 = new Book(1, "Clean Code", "", "", "", 0);

        assertNotEquals(book1, book2);

    }
}
