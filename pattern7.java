package com.qspiders.qwerty;

public class pattern7 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		if(i==3||j==3){
			System.out.print(5);	
		}
		else{
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	
}
}
/*
	  5  
	  5  
	55555
	  5  
	  5 
*/