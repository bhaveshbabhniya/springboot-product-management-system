package com.springboot.product_management_system.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String message) {
     super(message);
 }
}
