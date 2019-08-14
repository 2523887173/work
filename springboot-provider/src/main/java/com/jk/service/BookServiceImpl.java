package com.jk.service;

import com.jk.dao.BookMapper;
import com.jk.model.Book;
import com.jk.utils.Easyuipage;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

//分页查询
    @Override
    public Easyuipage queryPageBookList(Integer page, Integer rows, Book book) {
        Easyuipage result = new Easyuipage();
        HashMap<String,Object> params = new HashMap<>();
//查询总条数
        params.put("book", book);
        int count = bookMapper.findBookCount(params);
//将查询出来的总条数放到总返回体中--2
        result.setTotal(count);
//查询分页列表
        PageUtil<Book> pageUtil = new PageUtil<>(count,page,rows);
        params.put("startIndex", pageUtil.getStartIndex());
        params.put("endIndex", pageUtil.getEndIndex());
        List<Book> books = bookMapper.findBookList(params);
        pageUtil.setList(books);
//将分页查询出来的列表放到总返回体中 --3
        result.setRows(books);
        return result;
    }
//删除
    @Override
    public void delBook(Integer[] ids) {
        bookMapper.delBook(ids);
    }
//修改
    @Override
    public void updateBookList(Book book) {
        bookMapper.updateBookList(book);
    }
//新增
    @Override
    public void addBookList(Book book) {
        bookMapper.addBookList(book);
    }
//回显
    @Override
    public Book queryFindBookById(Integer id) {
        return bookMapper.queryFindBookById(id);
    }
}
