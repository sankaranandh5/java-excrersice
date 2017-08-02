package com.qspiders.qwerty;

public class Pattern21 {
public static void main(String[] args) {
	int n,m=1;
	n=5;
	for(int i=1;i<=n;i++){
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=m;k++){
			System.out.print("*");
		}
		System.out.println();
		m+=2;
	}
	
	m-=2;
	
	for(int i=n-1;i>=1;i--){
		m-=2;
		for(int j=n-1;j>=i;j--){
			System.out.print(" ");
		}
		for(int k=m;k>=1;k--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
/*
	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
*/