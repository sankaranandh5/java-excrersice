package com.qspiders.qwerty;

public class Pattern24 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}
		for(int k=i-1;k>=-(i-1);k--){
			System.out.print(1+Math.abs(k));
		}
		System.out.println();
	}
	
	 n=4;
	for(int i=n;i>=1;i--){
		for(int j=n;j>=i;j--){
			System.out.print(" ");
		}
		for(int k=i-1;k>=-(i-1);k--){
			System.out.print(1+Math.abs(k));
		}
		System.out.println();
	}
}
}
/*
		    1
		   212
		  32123
		 4321234
		543212345
		 4321234
		  32123
		   212
		    1
*/