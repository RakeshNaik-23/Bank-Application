package com.AbstractInterface;

public abstract class Account {
	
	   public abstract void withdraw(double amount);
	   public abstract void deposite(double amount);
	   public abstract void balanceEnquiry();
	   public abstract void displayMessage(String action,double amount);
	
}
