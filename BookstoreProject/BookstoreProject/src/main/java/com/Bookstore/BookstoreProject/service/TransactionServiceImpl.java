package com.Bookstore.BookstoreProject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookstore.BookstoreProject.model.Transaction;
import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.repository.TransactionRepo;

@Service
@Transactional

public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	public TransactionRepo repository;

	@Override
	public List<Transaction> getTransactiondetails() {
		
		return this.repository.findAll();
	}

	@Override
	public Transaction getTransactiondetailsbyId(long Id) {
		
		Optional<Transaction> Obj = this.repository.findById(Id);
        if (Obj.isPresent()) {
            return Obj.get();
        } else {
            return null;
        }	}

	
}
