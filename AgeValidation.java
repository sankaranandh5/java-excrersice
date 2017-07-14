package com.jspiders.exception;

class InvalidAgeException extends Exception{
	
	/*
	 * printStackTrace()
	 * getMessage()
	 */
	
	public InvalidAgeException(String message) {
		super(message);
	}
}


public class AgeValidation {
	
	int validAge=18;
	
	
	void voting(int age) throws InvalidAgeException{
		
		if(age<validAge){
		throw new InvalidAgeException("Invalid age for voting");
		}else{
			System.out.println("You can vote as you are above 18");
		}
	}
	
	public static void main(String[] args) {
		
		AgeValidation ref=new AgeValidation();
		
		try {
			ref.voting(9);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
