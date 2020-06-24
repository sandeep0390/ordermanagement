package com.os.exception;

public class OrderCreationException extends RuntimeException{

	@Override
	public String getMessage() {
		 return "order creation failed";
	}
	
}
