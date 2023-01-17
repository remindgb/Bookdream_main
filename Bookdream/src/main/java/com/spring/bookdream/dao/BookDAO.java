package com.spring.bookdream.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bookdream.vo.BookVO;

@Repository
public class BookDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<BookVO> getBookList(BookVO vo) {
		
		return mybatis.selectList("BookDAO.getBookList", vo);
	}
	
}