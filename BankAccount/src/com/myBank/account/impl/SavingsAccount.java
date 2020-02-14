package com.myBank.account.impl;

import com.myBank.account.Growable;
import com.myBank.account.impl.exception.InsufficientBalanceException;

public class SavingsAccount extends Account implements Growable {

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
		double balance = getBalance();
		if (amount > balance) {
			throw new InsufficientBalanceException();
		} else
			setBalance(balance - amount);

	}

	@Override
	public void calculateInterest() {

	}

}
