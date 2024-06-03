package com.bookville.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="description")
    private String description;

    @Column(name="genre")
    private String genre;

    @Column(name="price")
    private double price;

    // Getters and Setters
}
