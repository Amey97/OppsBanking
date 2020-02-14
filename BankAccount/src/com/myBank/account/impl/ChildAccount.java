package com.myBank.account.impl;

import com.myBank.account.Maturable;
import com.myBank.account.impl.exception.InsufficientBalanceException;

public class ChildAccount extends Account implements Maturable {

	public ChildAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {

	}

	@Override
	public void mature() {

	}

}
