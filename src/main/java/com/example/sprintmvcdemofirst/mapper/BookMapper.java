package com.example.sprintmvcdemofirst.mapper;

import com.example.sprintmvcdemofirst.domain.Book;
import com.example.sprintmvcdemofirst.dto.BookData;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

    BookData mapToBooksData(Book books);

}
