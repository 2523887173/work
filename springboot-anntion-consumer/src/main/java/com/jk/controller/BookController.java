package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Book;
import com.jk.service.BookService;
import com.jk.utils.Easyuipage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/book")
public class BookController {


    @Reference(version = "1.0")
    private BookService bookService;
    //跳转booklist页面
    @RequestMapping("/toBookList")
    public String toPlaneList(){

        return "Boolist.html";
    }
    //分页查询
    @RequestMapping("queryPageBookList")
    @ResponseBody
    public Easyuipage queryPageBookList(Integer page, Integer rows, Book book) {
        return bookService.queryPageBookList(page,rows,book);
    }
    //新增//addBookList修改
    @RequestMapping("addBookList")
    @ResponseBody
    public Boolean addBookList(Book book) {
        try {
            if(book.getId()!=null) {
                bookService.updateBookList(book);
            }else {
                bookService.addBookList(book);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //queryFindBookById修改回显
    @RequestMapping("queryFindBookById")
    @ResponseBody
    public Book queryFindBookById(Integer id) {
        return bookService.queryFindBookById(id);
    }
    //删除
    @RequestMapping("del")
    @ResponseBody
    public Boolean delBook(Integer[] ids){
        bookService.delBook(ids);
        return true;
    }
}
