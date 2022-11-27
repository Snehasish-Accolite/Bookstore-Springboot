package com.Bookstore.BookstoreProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=BookstoreProjectApplication.class)
public class BookstoreProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreProjectApplication.class, args);
	}

}
