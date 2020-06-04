package com.thinksky.springcachetutorial;

public interface BookRepository {

    Book getByIsbn(String isbn);

}

