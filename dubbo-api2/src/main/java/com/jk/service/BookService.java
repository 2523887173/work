package com.jk.service;

import com.jk.model.Book;
import com.jk.utils.Easyuipage;


/**
 * @author Administrator
 */
public interface BookService {

    Easyuipage queryPageBookList(Integer page, Integer rows, Book book);
    void delBook(Integer[] ids);

    void updateBookList(Book book);

    void addBookList(Book book);

    Book queryFindBookById(Integer id);
}
