package com.spring.bookdream.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.bookdream.auth.SNSLogin;
import com.spring.bookdream.auth.SnsValue;

@Controller
public class SnsLoginController {
		
		// Google Login
		@Inject
		private GoogleConnectionFactory googleConnectionFactory;
		@Inject
		private OAuth2Parameters googleOAuth2Parameters;
	
		@Inject
		private SnsValue naverSns;
		@Inject
		private SnsValue googleSns;
	
	
		@RequestMapping(value="/login", method = RequestMethod.GET)
		public void login(Model model) throws Exception {
			// Naver Login
			SNSLogin snsLogin = new SNSLogin(naverSns);
			model.addAttribute("naver_url", snsLogin.getNaverAuthURL());
			
			// Google Login
			OAuth2Operations oauthOperations = googleConnectionFactory.getOAuthOperations();
			String url = oauthOperations.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, googleOAuth2Parameters);

			System.out.println("구글:" + url);
			model.addAttribute("google_url", url);
			
			
		}
		
		// 구글 Callback호출 메소드
		@RequestMapping(value = "/oauth2callback", method = { RequestMethod.GET, RequestMethod.POST })
		public String googleCallback(Model model, @RequestParam String code) throws IOException {
			System.out.println("여기는 googleCallback");

			return "googleSuccess.jsp";
		}
		
}
