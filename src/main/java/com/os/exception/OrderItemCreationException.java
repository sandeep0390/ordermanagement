package com.os.exception;

public class OrderItemCreationException extends RuntimeException{

	@Override
	public String getMessage() {
		return "order item creation failed";
	}
	
}
