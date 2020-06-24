package com.os.exception;

public class OrderNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		 return "order not found";
	}
	
}
