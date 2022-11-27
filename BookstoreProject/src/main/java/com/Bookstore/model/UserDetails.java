package com.Bookstore.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "userDetails")
public class UserDetails {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	long userId;

	@Column(name="Username")
	String Username;

	@Column(name="EmailId",unique=true)
	String emailId;

	@Column(name="PhoneNo",unique=true)
	String phoneNo;

	//	 @CreationTimestamp
	//	  private Date createdTime;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	//	public Date getCreatedTime() {
	//		return createdTime;
	//	}
	//
	//	public void setCreatedTime(Date createdTime) {
	//		this.createdTime = createdTime;
	//	}






}
