package com.spring.bookdream.service;

import java.util.List;

import com.spring.bookdream.vo.UserVO;

public interface UserService {

	// 유저 정보 조회
	List<UserVO> getUser(UserVO vo);
}
