package com.Bookstore.BookstoreProject.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.model.Wallet;
import com.Bookstore.BookstoreProject.repository.TransactionRepo;
import com.Bookstore.BookstoreProject.repository.WalletRepository;

@Service
@Transactional

public class WalletServiceImpl implements WalletService{

	@Autowired
	public WalletRepository walletrepository;
	
	@Autowired
	public TransactionRepo transacrepository;

	@Override
	public Wallet setWalletdetails(Wallet w) {
		return walletrepository.save(w);
	}

	@Override
	public Wallet updateAmountbyId(long ID, Wallet w) {
		// TODO Auto-generated method stub
		Optional<Wallet> Obj2= this.walletrepository.findById(ID);
		if(Obj2.isPresent()){
			

			//			Ow.setUserId(w.getUserId());
			//			Ow.setWallId(w.getWallId());

			if(w.getWalletAmount()%500==0) 
			{
				Wallet Ow=Obj2.get();
				Ow.setWalletAmount(Ow.getWalletAmount()+w.getWalletAmount());

				return walletrepository.save(Ow);
			}
			else {
				return null;
			}
			
		}
		else {
			return null;
		}

	}

	@Override
	public List<Wallet> getWalletdetails() {
		// TODO Auto-generated method stub
		return walletrepository.findAll();
	}

	@Override
	public Wallet getWalletdetailsbyId(long Id) {
		// TODO Auto-generated method stub
		Optional<Wallet> Obj3 = walletrepository.findById(Id);
		if (Obj3.isPresent()) {
			return Obj3.get();
		} else {
			return null;
		}

	}

}
