package com.Bookstore.BookstoreProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Bookstore.BookstoreProject.model.Transaction;
import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.service.BookService;
import com.Bookstore.BookstoreProject.service.TransactionService;

@RestController
public class TransactController {

	@Autowired
    private TransactionService service;
	
	 @GetMapping(path="/transactiondetails")
	    private ResponseEntity<List<Transaction>> disptransac(){
	        return  ResponseEntity.ok().body(this.service.getTransactiondetails());
	    }

	    @GetMapping(path="/transactiondetails/{userId}")
	    private ResponseEntity<Transaction> disptransac(@PathVariable int userId){
	        return ResponseEntity.ok().body(this.service.getTransactiondetailsbyId(userId));
	
}
}
