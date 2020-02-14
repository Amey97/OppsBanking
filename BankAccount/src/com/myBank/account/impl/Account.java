package com.myBank.account.impl;

import com.myBank.account.Depositable;
import com.myBank.account.Withdrawable;

public abstract class Account implements Depositable, Withdrawable {

	private String accountHolderName;
	private String accountNumber;
	private double balance;

	public Account(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	protected String getAccountHolderName() {
		return accountHolderName;
	}

	protected void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	protected String getAccountNumber() {
		return accountNumber;
	}

	protected void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

}
