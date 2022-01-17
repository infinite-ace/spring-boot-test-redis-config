package com.example.sprintmvcdemofirst.service;

import com.example.sprintmvcdemofirst.domain.BookRepository;
import com.example.sprintmvcdemofirst.dto.BookData;
import com.example.sprintmvcdemofirst.mapper.BookMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
@AllArgsConstructor
@ConditionalOnProperty(value = "cache.enabled", havingValue = "true")
public class CachedInternalAPIsService implements InternalAPIsService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    @Cacheable(value = "book")
    public List<BookData> getBooksCached() {
        return bookRepository
                .findAll()
                .stream()
                .map(bookMapper::mapToBooksData)
                .collect(Collectors.toList());
    }

//    @Override
//    @Cacheable(value = "book-data")
//    example code if you would do an API call and would make a request to annother service
//    public Account getBook(String bookId) {
//        BookModel bookModel = booksApi.apiV1BookDataInternalGetGet(bookId).getResultObject();
//        if (nonNull(bookModel)) {
//            return bookMapper.mapToBooksData(bookModel);
//        }
//        throw new RuntimeException("Null payload received from booksApi.");
//    }
}
