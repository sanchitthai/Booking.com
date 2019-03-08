package com.booking.core;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingMain {

	Logger logger = Logger.getLogger(BookingMain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(BookingMain.class);
		System.out.println("test");
	
		
	}

	
	
}
