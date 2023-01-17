package com.spring.bookdream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bookdream.dao.UserDAO;
import com.spring.bookdream.vo.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public List<UserVO> getUser(UserVO vo) {
		
		return userDAO.getUser(vo);
	}



}
