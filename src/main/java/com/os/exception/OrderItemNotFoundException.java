package com.os.exception;

public class OrderItemNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		return "order item not found";
	}
	
}
