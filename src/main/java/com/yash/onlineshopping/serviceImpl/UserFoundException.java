package com.yash.onlineshopping.serviceImpl;

public class UserFoundException extends Exception {

	public UserFoundException() {
		super("User Already present");
	}
}
