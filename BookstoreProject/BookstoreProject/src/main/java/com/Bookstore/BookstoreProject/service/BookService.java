package com.Bookstore.BookstoreProject.service;

import java.util.List;

import com.Bookstore.BookstoreProject.model.UserDetails;




public interface BookService {

	UserDetails setUser(UserDetails u);
    UserDetails updateUser(UserDetails u);
    List<UserDetails> getUser();
    UserDetails getUserById(long Id);
    
}