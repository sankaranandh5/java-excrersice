package com.qspiders.qwerty;

public class pattern17 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=n-1;j>=i;j--){
			System.out.print(" ");
		}
		for(int k=i-1;k>=-(i-1);k--){
			System.out.print(i-Math.abs(k));
		}
		System.out.println();
	}
}
}
/*
	    1
	   121
	  12321
	 1234321
	123454321

*/