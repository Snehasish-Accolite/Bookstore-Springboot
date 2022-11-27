package com.Bookstore.BookstoreProject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookstore.BookstoreProject.model.UserDetails;
import com.Bookstore.BookstoreProject.repository.BookRepository;



@Service
@Transactional
public class BookServiceImpl implements BookService {


    @Autowired
    public BookRepository repository;

    @Override
    public UserDetails setUser(UserDetails u) {
        return repository.save(u);
    }

    @Override
    public UserDetails updateUser(UserDetails u) {
        Optional<UserDetails> Obj1 = this.repository.findById(u.getUserid());
        if(Obj1.isPresent()){
            UserDetails Ud = Obj1.get();
            Ud.setUserid(u.getUserid());
            Ud.setUsername(u.getUsername());
            Ud.setEmailid(u.getEmailid());
            Ud.setPhoneno(u.getPhoneno());
           
            return this.repository.save(Ud);
        }
        else {
            return null;
        }
    }

    @Override
    public List<UserDetails> getUser() {
        return this.repository.findAll();
    }

    @Override
    public UserDetails getUserById(long Id) {
        Optional<UserDetails> Obj = this.repository.findById(Id);
        if (Obj.isPresent()) {
            return Obj.get();
        } else {
            return null;
        }

    }

	

}
