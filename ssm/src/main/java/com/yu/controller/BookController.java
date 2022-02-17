package com.yu.controller;

import com.yu.pojo.Books;
import com.yu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    /*查询全部的书*/
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
    /*查询一本书*/
   @RequestMapping("/oneBook")
    public String selectBook(Model model,@PathVariable("bookID") int id){
       Books book = bookService.selectBookById(id);
       model.addAttribute("book",book);
       return "allBook";
   }
   /*增加一本书*/
   @RequestMapping("/toAddBook")
   public String toAddPaper() {
       return "addBook";
   }
    @RequestMapping("/addBook")
public String addBook(Books books){
      bookService.addBook(books);
      return "redirect:/book/allBook";
}
    /*修改一本书*/
    /*根据id先获取对象，再更改属性*/
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.selectBookById(id);
        model.addAttribute("book",books );
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        bookService.updateBook(book);
        Books books = bookService.selectBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }
    /*删除一本书*/
    @RequestMapping("/del/{bookId}")
    public String deleteBook( @PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
