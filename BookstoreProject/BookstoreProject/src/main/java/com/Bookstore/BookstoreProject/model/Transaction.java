package com.Bookstore.BookstoreProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TransactionStatus")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long TransId;
	
	@Column(name="UserId")
	private long UserId;
	
	@Column(name="transaction")
	private String transaction;

	public long getTransId() {
		return TransId;
	}

	public void setTransId(long transId) {
		TransId = transId;
	}

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	
	
	
}
