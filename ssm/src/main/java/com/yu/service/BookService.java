package com.yu.service;

import com.yu.pojo.Books;

import java.util.List;

public interface BookService {
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //新添一本书
    int addBook(Books books);
    //根据id删除一个Book
    int deleteBookById(int id);
    //根据id查询一个book
    Books selectBookById(int id);
    //更新Book
    int updateBook(Books books);
}
