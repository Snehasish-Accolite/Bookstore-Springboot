package com.Bookstore.BookstoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bookstore.BookstoreProject.model.UserDetails;


public interface BookRepository extends JpaRepository<UserDetails,Long>{

}
