package com.gmail.gimuniys.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@JsonIgnoreProperties(value = { "delete", "userPW" })
//@DynamicUpdate
//@Cacheable(false)
//@CacheEvict(allEntries = true)
@Entity
@Table(name="users")
@Getter @Setter
@ToString
public class Users {

	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_pw")
	private String userPw;
	
	@Column(name="user_name")
	private String userName;
	
//	@Column(name = "delete_yn", insertable = false)
//	private boolean delete;
//	
//	@Column(name = "delete_date", insertable = false)
//	private Timestamp deleteDate;
//	
//	@Column(name = "reg_date", insertable = false, updatable = false)
//	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	private Date regDate;
	
	
}
