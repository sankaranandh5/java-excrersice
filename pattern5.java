package com.qspiders.qwerty;

public class pattern5 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<=5;i++){
		for(j=5-i;j>=1;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(k);
		}
		System.out.println();
	}
}
}
/*
	    1
	   22
i	  333
	 4444
	55555

 */
/*
	    1
	   12
k	  123
	 1234
	12345
*/