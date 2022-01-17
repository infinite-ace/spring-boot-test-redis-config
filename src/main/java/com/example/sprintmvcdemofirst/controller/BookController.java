package com.example.sprintmvcdemofirst.controller;

import com.example.sprintmvcdemofirst.domain.Book;
import com.example.sprintmvcdemofirst.dto.BookData;
import com.example.sprintmvcdemofirst.service.BookService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Api(tags = "Books")
@RequestMapping(path ="/api", produces = "application/json")
public class BookController {

    private final BookService bookService;

    @ResponseBody
    @Description("Get Books")
    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> response = bookService.getAllBooks();
        return ResponseEntity.ok(response);
    }

    @ResponseBody
    @Description("Add Book")
    @PostMapping(value = "/book")
    public ResponseEntity<Book> addBook(@RequestParam(value = "author") String author,
                                        @RequestParam(value = "name") String name) {

        Book response = bookService.addBook(Book.builder()
                .id(UUID.randomUUID().toString())
                .author(author)
                .name(name)
                .build());
        return ResponseEntity.ok(response);
    }

    @ResponseBody
    @Description("Get Books with caching")
    @GetMapping(value = "/booksCache")
    public ResponseEntity<List<BookData>> getAllBooksCache() {
        List<BookData> response = bookService.getAllBooksWithCache();
        return ResponseEntity.ok(response);
    }
}
