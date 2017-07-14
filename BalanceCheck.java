package com.jspiders.exception;

class LowBalanceException extends Exception{
	public LowBalanceException(String message) {
		super(message);
	}
}

public class BalanceCheck {
	int validbal = 10000;
	
	void withdraw(int amt) throws LowBalanceException{
		if(amt>validbal){
			throw new LowBalanceException("low balance");
		}
		else{
			System.out.println("entered amount can be withdrawn");
		}
	}
	
public static void main(String[] args) {
	BalanceCheck ref = new BalanceCheck();
	try {
		ref.withdraw(11000);
	} catch (LowBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
