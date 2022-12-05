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
import com.Bookstore.BookstoreProject.model.Wallet;
import com.Bookstore.BookstoreProject.service.BookService;
import com.Bookstore.BookstoreProject.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	private WalletService wservice;



	@PostMapping(path = "/addWalletdetails")
	private ResponseEntity<Wallet> savewallet(@RequestBody Wallet w){
		return ResponseEntity.ok().body(this.wservice.setWalletdetails(w));
	}
	@GetMapping(path="/dispWalletdetails")
	private ResponseEntity<List<Wallet>> dispWallet(){
		return ResponseEntity.ok().body(this.wservice.getWalletdetails());
	}

	@GetMapping(path="/walletdetails/{userId}")
	private ResponseEntity<Wallet> dispWalletbyId(@PathVariable int userId){
		return ResponseEntity.ok().body(this.wservice.getWalletdetailsbyId(userId));
	}

	@PutMapping("/updateWallet/{userId}")
	private ResponseEntity<Wallet> updateWallet(@PathVariable int userId,@RequestBody Wallet w){
		
		return ResponseEntity.ok().body(this.wservice.updateAmountbyId(userId,w));
	}
}
