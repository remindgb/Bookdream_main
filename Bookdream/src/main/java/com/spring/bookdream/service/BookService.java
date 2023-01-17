package com.spring.bookdream.service;

import java.util.List;

import com.spring.bookdream.vo.BookVO;

public interface BookService {

	// 도서 목록 조회
	List<BookVO> getBookList(BookVO vo);
}
