package com.myBank.account.impl;

import com.myBank.account.impl.exception.InsufficientBalanceException;
import com.myBank.account.impl.exception.LowBalanceException;

public class CurrentAccount extends Account {

	private double minimumBalance;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
		minimumBalance = 0;
	}

	public CurrentAccount(String accountHolderName, String accountNumber, double balance, double minimumBalance) {
		super(accountHolderName, accountNumber, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void withdraw(double amount) {

		double balance = getBalance();

		if (balance - amount < minimumBalance) {
			throw new LowBalanceException();
		} else
			setBalance(balance - amount);

	}

}
