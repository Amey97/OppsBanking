package com.myBank.account.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.myBank.account.impl.Account;
import com.myBank.account.impl.SavingsAccount;

public class BankInterface {

	public static Map<String, Account> accountList;

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Who you are? 1. Doctor 2. Admin");
		int i = scanner.nextInt();
		if(i==1) {
		
		}
		

		Account accountOne = new SavingsAccount("One", "SA001", 10000);
		Account accountTwo = new SavingsAccount("Two", "SA002", 20000);
		Account accountThree = new SavingsAccount("Three", "SA003", 30000);
		Account accountFour = new SavingsAccount("Four", "SA004", 40000);

		accountList = new HashMap<String, Account>();
		accountList.put("SA001", accountOne);
		accountList.put("SA002", accountTwo);
		accountList.put("SA003", accountThree);
		accountList.put("SA004", accountFour);

		Account myAccount = accountList.get("SA003");
		myAccount.deposit(10000);
	}

}
