package com.spring.bookdream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.spring.bookdream.dao.BookDAO;
import com.spring.bookdream.service.BookService;
import com.spring.bookdream.vo.BookVO;

@Controller
public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/bookList")
	public String bookList(BookVO vo, BookDAO bookDAO, Model model) {

		model.addAttribute("bookList", bookService.getBookList(vo));	// Model 정보 저장
		return "/book";
	}

}
