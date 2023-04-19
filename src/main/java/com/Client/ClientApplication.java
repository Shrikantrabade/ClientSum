package com.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Demo.Add.Sum;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
		Sum sum =new Sum();
	    sum.sum(10, 200);
	    
	    System.out.println("addition of a and b:");
		
		
	    
		
	}

}
