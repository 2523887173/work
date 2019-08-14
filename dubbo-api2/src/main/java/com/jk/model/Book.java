package com.jk.model;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String name;
    private String bookTime;
    private Integer bookStatus;
    private String bookDetail;
    private Integer bookType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookTime='" + bookTime + '\'' +
                ", bookStatus=" + bookStatus +
                ", bookDetail='" + bookDetail + '\'' +
                ", bookType=" + bookType +
                '}';
    }
}
