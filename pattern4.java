package com.qspiders.qwerty;

public class pattern4 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--){
		for(int j=5;j>=i;j--){
			System.out.print(j);
		}
		System.out.println();
	}
}
}

/*
	5
	44
i	333
	2222
	11111
*/

/*
	5
	54
j	543
	5432
	54321
*/