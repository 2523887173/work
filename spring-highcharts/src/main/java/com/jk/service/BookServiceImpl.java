package com.jk.service;

import com.jk.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Map<String, Object>> queryBook() {
        return bookMapper.queryBook();
    }

    @Override
    public List<Map<String, Object>> queryBookBing() {
        return bookMapper.queryBookBing();
    }

    @Override
    public List<Map<String, Object>> queryBookShuzhuang() {
        return bookMapper.queryBookShuzhuang();
    }

    @Override
    public List<Map<String, Object>> queryZhuxing() {
        return bookMapper.queryZhuxing();
    }
}
