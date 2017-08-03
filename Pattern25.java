package com.qspiders.qwerty;

public class Pattern25 {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--){
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}
		for(int k=i-1;k>=-(i-1);k--){
			System.out.print(1+Math.abs(4-k));
		}
		System.out.println();
	}
}
}
/*
		123456789
		 2345678
		  34567
		   456
		    5
*/