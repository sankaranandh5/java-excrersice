package com.qspiders.qwerty;

public class pattern19 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=7;j++){
				if((i%2)!=0 &&(j==1||j==2||j==6||j==7)){
					System.out.print(" ");
				}
				else{
					System.out.print('*');
				}
			}
			System.out.println();
		}	
	}
}
/*
	  ***  
	*******
	  ***  
	*******
	  *** 
*/