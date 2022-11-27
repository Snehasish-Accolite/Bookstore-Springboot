package com.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Bookstore.model.UserDetails;

public interface BookRepository extends JpaRepository<UserDetails,Long>{

}
