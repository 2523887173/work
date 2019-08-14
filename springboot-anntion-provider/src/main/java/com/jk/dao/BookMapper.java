package com.jk.dao;

import com.jk.model.Book;

import java.util.HashMap;
import java.util.List;

public interface BookMapper {
    int findBookCount(HashMap<String, Object> params);

    List<Book> findBookList(HashMap<String, Object> params);

    void delBook(Integer[] ids);

    void updateBookList(Book book);

    void addBookList(Book book);

    Book queryFindBookById(Integer id);
}
