package com.example.sprintmvcdemofirst.dto;

import lombok.*;

import java.io.Serializable;


@Data
@Builder
public class BookData implements Serializable {
    private String id;
    private String author;
    private String name;
}
