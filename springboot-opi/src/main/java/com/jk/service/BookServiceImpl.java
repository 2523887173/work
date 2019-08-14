package com.jk.service;

import com.jk.dao.BookMapper;
import com.jk.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBookList() {
        return bookMapper.queryBookList();
    }

    @Override
    public void addBook(List<Book> list) {
        bookMapper.addBook(list);
    }
}
