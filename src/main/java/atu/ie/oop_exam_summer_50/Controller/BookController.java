package atu.ie.oop_exam_summer_50.Controller;

import atu.ie.oop_exam_summer_50.Model.Book;
import atu.ie.oop_exam_summer_50.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book) {
        bookService.addRoom(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }



    @GetMapping("/Show")
    public ResponseEntity<List<Book>> showBooks(){
      return new ResponseEntity<>(bookService.getBookings(), HttpStatus.OK);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<Book> showBook(@PathVariable long id){
        return new ResponseEntity<>(bookService.getBoooking(id),HttpStatus.OK);
    }
}
