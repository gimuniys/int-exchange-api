package com.gmail.gimuniys.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gmail.gimuniys.model.mongo.MongoDTO;

public interface MongoDAO extends MongoRepository<MongoDTO, String> {

}
