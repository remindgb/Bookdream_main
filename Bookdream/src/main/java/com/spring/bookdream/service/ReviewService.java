package com.spring.bookdream.service;

import java.util.List;
import com.spring.bookdream.vo.ReviewVO;


public interface ReviewService {

	//book_no 하나에 매핑된 Review
	List<ReviewVO> getReview(int book_no);

}
