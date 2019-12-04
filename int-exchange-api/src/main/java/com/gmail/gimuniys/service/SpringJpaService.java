package com.gmail.gimuniys.service;

import org.springframework.stereotype.Service;

@Service
public class SpringJpaService {
//	@Autowired
//    private UsersRepository usersRepository;
//	
//	public void createUser(Users users) {
//        Optional<Users> exist = usersRepository.findById(users.getUserId());
//        if(exist.isPresent()) {
//            throw new TestException(HttpStatus.CONFLICT, "존재하는 ID 입니다.");
//        }
//        usersRepository.save(users);
//    }
//	
//    public Users getUserOne(String id) {
//        return usersRepository.findById(id)
//            .orElseThrow(() -> new TestException(HttpStatus.NOT_FOUND, 
//                "없는 ID 입니다."));
//    }
// 
//    public List<Users> getUserAll() {
//        List<Users> users = usersRepository.findAll();
//        return users;
//    }
}
