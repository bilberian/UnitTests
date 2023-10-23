package HW4main;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BookServiceTest {
    BookServiceTest() {
    }

    @Test
    public void testFindBookById() {
        Book book = new Book("3", "Ullyses", "James Joyce");
        BookRepository mockRepo = (BookRepository)Mockito.mock(BookRepository.class);
        Mockito.when(mockRepo.findById("3")).thenReturn(book);
        BookService bookService = new BookService(mockRepo);
        Book result = bookService.findBookById("3");
        Assertions.assertEquals("Ullyses", result.getTitle());
        Assertions.assertEquals("James Joyce", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        Book book1 = new Book("4", "Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("5", "Wuthering Heights", "Emily Bronte");
        BookRepository mockRepo = (BookRepository)Mockito.mock(BookRepository.class);
        Mockito.when(mockRepo.findAll()).thenReturn(List.of(book1, book2));
        BookService bookService = new BookService(mockRepo);
        List<Book> listOfBooks = bookService.findAllBooks();
        Assertions.assertEquals(1, result.size());
    }
}