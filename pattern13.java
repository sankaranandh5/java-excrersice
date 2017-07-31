package com.qspiders.qwerty;

public class pattern13 {
public static void main(String[] args) {
	int m=1;
	for(int i=1;i<=5;i++){
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
		for(int k=0;k<m;k++){
			System.out.print(k);
		}
		System.out.println();
		m+=2;
	}
}
}
/*
	    0
	   012
	  01234
	 0123456
	012345678
*/