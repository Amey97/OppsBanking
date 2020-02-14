package com.myBank.account;

import com.myBank.account.impl.exception.InsufficientBalanceException;

public interface Withdrawable {

	public void withdraw(double amount) throws InsufficientBalanceException;
}
