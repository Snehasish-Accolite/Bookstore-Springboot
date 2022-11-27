package com.Bookstore.BookstoreProject.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "userdetails")
public class UserDetails {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	long Userid;

	@Column(name="Username")
	String Username;

	@Column(name="EmailId",unique=true)
	String Emailid;

	@Column(name="PhoneNo",unique=true)
	String Phoneno;

	public long getUserid() {
		return Userid;
	}

	public void setUserid(long userid) {
		Userid = userid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public String getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}

	

	
}

	

