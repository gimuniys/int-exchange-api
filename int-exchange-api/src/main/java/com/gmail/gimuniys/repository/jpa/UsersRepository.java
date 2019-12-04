package com.gmail.gimuniys.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.gimuniys.model.jpa.Users;

@Repository("usersRepository")
public interface UsersRepository extends JpaRepository<Users, String>{
	
	List<Users> findByUserName(String userName);
	Users findByUserId(String userId);
	
}
