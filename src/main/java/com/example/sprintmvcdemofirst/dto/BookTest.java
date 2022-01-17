package com.example.sprintmvcdemofirst.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookTest {
    private String id;
    private String author;
    private String name;
}
