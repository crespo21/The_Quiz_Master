package com.tshepo.QuizMaster;

import com.tshepo.QuizMaster.Application.QuizMasterApplication;
import com.tshepo.QuizMaster.Service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = QuizMasterApplication.class)
class QuizMasterApplicationTests {


	AdminService adminService;

	@Test
	void contextLoads() {
	}


}
