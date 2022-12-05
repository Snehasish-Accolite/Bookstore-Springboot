package com.Bookstore.BookstoreProject.service;

import java.util.List;

import com.Bookstore.BookstoreProject.model.Transaction;



public interface TransactionService {

	List<Transaction> getTransactiondetails();
	
	Transaction getTransactiondetailsbyId(long Id);
}
