package com.Bookstore.BookstoreProject.service;

import java.util.List;


import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.model.Wallet;

public interface WalletService {

	Wallet setWalletdetails(Wallet w);
    Wallet updateAmountbyId(long ID,Wallet w);
    List<Wallet> getWalletdetails();
    Wallet getWalletdetailsbyId(long Id);
	
}
