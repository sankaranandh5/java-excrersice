package com.qspiders.qwerty;

public class pattern18 {
public static void main(String[] args) {
	int n=9;
	for(int i=1;i<=n;i++){
		for(int j=n-1;j>=i;j--){
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