package com.todo.dev;

import com.todo.dev.security.SecurityService;
import com.todo.dev.domain.entity.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.repository.MembersRepository;
import com.todo.dev.security.TokenInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevApplicationTests {

	// 로그인 Test
	@Autowired
	MembersRepository membersRepository;

	@Test
	void loginTest() {
		LoginRequest request = new LoginRequest("park","1234");
		Members findMember = membersRepository.findByIdAndPw(request);
		System.out.println(findMember.toString());
	}


	// Security Token Test
	@Autowired
	SecurityService securityService;
	@Test
	void valueRest(){
		Members member = new Members(1,
				"park",
				"1234",
				"park",
				"01022222222)");
		String token = securityService.createToken(member);
		System.out.println(token);
	}
	@Test
	void parseTokenTest(){
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJuYW1lIjoicGFyayIsInBob25lX251bWJlciI6IjAxMDIyMjIyMjIyKSIsImlkIjoxLCJleHAiOjE2NzY2MDMyODB9.vX_n_4s9oFcI_Rbcrb81eTvCcbCfm26x7snS079ZYN_cXA-2hgDAwY80v_zyvABSASdlh28vsKeJjLhhDhs37g";
		TokenInfo info = securityService.parseToken(token);
		System.out.println(info.toString());
	}



	@Test
	void builderTest(){
		Members member = Members
				.builder()
				.id(1)
				.member_id("park")
				.member_pw("1234")
				.name("park")
				.phone_number("01022222222")
				.build();
		System.out.println(member.toString());
	}





	// 기본 설치 되어 있는 거
	@Test
	void contextLoads() {
	}
}
