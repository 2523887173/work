package com.jk.service;

import com.jk.model.Book;

import java.util.List;

public interface BookService {

    List<Book> queryBookList();

    void addBook(List<Book> list);
}
