package atu.ie.oop_exam_summer_50.Service;

import atu.ie.oop_exam_summer_50.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();

    public Book addRoom(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> getBookings() {
        return books;
    }
}
