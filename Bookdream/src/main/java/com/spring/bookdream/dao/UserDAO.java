package com.spring.bookdream.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bookdream.vo.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	// 유저 정보 조회
	public List<UserVO> getUser(UserVO vo) {
		
		System.out.println("---> JDBC로 cartList() 처리");

		return mybatis.selectList("UserDAO.getUser", vo);
	}
	
}