package atu.ie.oop_exam_summer_50.Service;

import atu.ie.oop_exam_summer_50.Model.Book;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();
    private long idCounter = 0;

    public Book addRoom(Book book) {
        book.setId(idCounter++);
        books.add(book);
        return book;
    }

    public List<Book> getBookings() {
        return books;
    }
}
