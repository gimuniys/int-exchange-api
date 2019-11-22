
package com.gmail.gimuniys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.gimuniys.model.Member;
import com.gmail.gimuniys.model.Users;
import com.gmail.gimuniys.repository.MemberRepository;
import com.gmail.gimuniys.repository.UsersRepository;

@RestController
public class IndexController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	@GetMapping("/test")
	public Map<String, Object> testMessage() {
		/*MySQL*/
		List<Users> userList = usersRepository.findAll();
		System.out.println(userList.toString());

		/*MongoDB*/
		List<Member> memberList = memberRepository.findAll();
		System.out.println(memberList.toString());
		
//		Member member = new Member();
//		member.setUserId("egjeon");
//		member.setUserPw("passW0rd");
//		member.setUserName("전은광");
//		
//		memberRepository.insert(member);
		
		Map<String, Object> result = new HashMap<>();
		result.put("result", memberList);
		
		return result;
	}
}
