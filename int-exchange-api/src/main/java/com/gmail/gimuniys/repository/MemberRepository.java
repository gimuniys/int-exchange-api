package com.gmail.gimuniys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gmail.gimuniys.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {

}
