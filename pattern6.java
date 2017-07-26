package com.qspiders.qwerty;

public class pattern6 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--){
		for(int j=i-1;j>=1;j--){
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--){
			System.out.print(k);
		}
	System.out.println();
	}
}
}
/*
	    5
	   44
i	  333
	 2222
	11111	
*/

/*
	    5
	   54
k	  543
	 5432
	54321
*/