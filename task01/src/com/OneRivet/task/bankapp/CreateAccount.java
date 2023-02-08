package com.OneRivet.task.bankapp;

import java.util.Scanner;
import com.OneRivet.task.BankApplication;

public class CreateAccount extends BankApplication{
	static String name;
	static String account;

	CreateAccount(String name, String account){
		this.name=name;
		this.account=account;
	}
	public void createAccount() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = scn.next();
		System.out.println("Enter account: ");
		account = scn.next();
	}
}