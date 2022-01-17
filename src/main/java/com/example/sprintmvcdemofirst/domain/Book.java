package com.example.sprintmvcdemofirst.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@Document(collection = "book")
@AllArgsConstructor
public class Book {

    @Id
    private String id;

    private String author;
    private String name;
}
