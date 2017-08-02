package com.qspiders.qwerty;

public class Pattern22 {
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
}
}
/*
		    1
		   212
		  32123
		 4321234
		543212345
*/