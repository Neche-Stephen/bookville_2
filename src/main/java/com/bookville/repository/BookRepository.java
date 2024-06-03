package com.bookville.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookville.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
