package com.Bookstore.BookstoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bookstore.BookstoreProject.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Long> {

}
