package com.example.service;

public class AccountNotFoundExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundExeption(String accNum) {
		super(accNum);
	}

}