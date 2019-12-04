
package com.gmail.gimuniys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.gimuniys.model.jpa.Users;
import com.gmail.gimuniys.model.mongo.MongoDTO;
import com.gmail.gimuniys.repository.jpa.UsersRepository;
import com.gmail.gimuniys.repository.mongo.MongoDAO;

@RestController
public class IndexController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	MongoDAO memberRepository;
	
	@GetMapping("/test")
	public Map<String, Object> testMessage() {
		/*MongoDB*/
		List<MongoDTO> memberList = memberRepository.findAll();
		System.out.println("===================== MongoDB =====================");
		
//		Member member = new Member();
//		member.setUserId("egjeon");
//		member.setUserPw("passW0rd");
//		member.setUserName("전은광");
//		
//		memberRepository.insert(member);
		
		Map<String, Object> result = new HashMap<>();
		result.put("memberList", memberList);
		
		return result;
	}
	
	@PostMapping("/test")
	public Map<String, Object> clientResponse(@RequestBody Map<String,Object> map) {
		System.out.println("===================== MySQL =====================");
		
		/*MySQL*/
		List<Users> userList = usersRepository.findAll();

		Map<String, Object> result = new HashMap<>();
		result.put("resultCode", 200);
		result.put("userList", userList.toString());

		return result;
	}
}
