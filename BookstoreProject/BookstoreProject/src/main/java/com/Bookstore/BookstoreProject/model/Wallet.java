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
@Table(name = "Wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long wallId;
	
	@Column(name="Userid")
	private long userId;
	
	@Column(name="Walletamount")
	private long walletAmount;
	
	
	public long getWallId() {
		return wallId;
	}
	public void setWallId(long wallId) {
		this.wallId = wallId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(long walletAmount) {
		this.walletAmount = walletAmount;
	}
	
	
}
