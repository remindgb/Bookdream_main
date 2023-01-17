package com.spring.bookdream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.spring.bookdream.dao.UserDAO;
import com.spring.bookdream.service.UserService;
import com.spring.bookdream.vo.UserVO;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user")
	public String userList(UserVO vo, UserDAO userDAO, Model model) {
				
		model.addAttribute("userList", userService.getUser(vo));	// Model 정보 저장
		return "/user.jsp";
	}

}
