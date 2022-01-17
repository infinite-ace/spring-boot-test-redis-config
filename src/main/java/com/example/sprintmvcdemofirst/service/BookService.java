package com.example.sprintmvcdemofirst.service;

import com.example.sprintmvcdemofirst.domain.Book;
import com.example.sprintmvcdemofirst.domain.BookRepository;
import com.example.sprintmvcdemofirst.dto.BookData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final InternalAPIsService internalAPIsService;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<BookData> getAllBooksWithCache() {
        return internalAPIsService.getBooksCached();
    }

}
