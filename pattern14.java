package com.qspiders.qwerty;

public class pattern14 {
public static void main(String[] args) {
	int m=2;
for(int i=1;i<=5;i++){
	for(int j=5;j>i;j--){
		System.out.print(" ");
	}
	for(int k=0;k<m;k++){
		System.out.print(k);
	}
	m+=2;
			System.out.println();
}
}
}
/*
	    01
	   0123
	  012345
	 01234567
	0123456789
*/