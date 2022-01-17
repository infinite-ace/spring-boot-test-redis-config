package com.example.sprintmvcdemofirst.service;

import com.example.sprintmvcdemofirst.dto.BookData;

import java.util.List;

public interface InternalAPIsService {

    List<BookData> getBooksCached();

}