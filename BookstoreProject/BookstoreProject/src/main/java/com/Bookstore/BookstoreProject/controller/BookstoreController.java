package com.Bookstore.BookstoreProject.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.service.BookService;




@RestController
public class BookstoreController {
	
	
	    @Autowired
	    private BookService service;
	    
	   

	    @PostMapping(path = "/addUserdetails")
	    private ResponseEntity<UserDetails> saveUser(@RequestBody UserDetails u){
	        return ResponseEntity.ok().body(this.service.setUser(u));
	    }
	    @GetMapping(path="/userdetails")
	    private ResponseEntity<List<UserDetails>> dispUsers(){
	        return  ResponseEntity.ok().body(this.service.getUser());
	    }

	    @GetMapping(path="/userdetails/{userId}")
	    private ResponseEntity<UserDetails> dispUser(@PathVariable int userId){
	        return ResponseEntity.ok().body(this.service.getUserById(userId));
	    }

	    @PutMapping("/update/{userId}")
	    private ResponseEntity<UserDetails> updateUser(@PathVariable int userId,@RequestBody UserDetails u){
	        u.setUserid(userId);
	        return ResponseEntity.ok().body(this.service.updateUser(u));
	    }

	    }

