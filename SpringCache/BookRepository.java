package com.example.SpringCache;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
