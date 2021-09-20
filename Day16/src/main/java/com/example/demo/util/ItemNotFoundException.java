package com.example.demo.util;

public class ItemNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1500473761444849244L;

	public ItemNotFoundException(String message) {
		super(message);
	}

	public ItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ItemNotFoundException(Throwable cause) {
		super(cause);
	}
}
