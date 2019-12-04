package com.gmail.gimuniys.model.mongo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "users")
@Getter @Setter
@ToString
public class MongoDTO {
	
	@Id
	private String userId;
	private String userPw;
	private String userName;
	
}
