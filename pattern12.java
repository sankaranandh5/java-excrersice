package com.qspiders.qwerty;

public class pattern12 {
public static void main(String[] args) {
	for(char i='A';i<='E';i++){
		for(char j='A';j<i;j++){
			System.out.print(" ");
		}
		for(char k='E';k>=i;k--){
			System.out.print(k);
		}
		System.out.println();
	}
}
}
/*
	EDCBA
	 EDCB
	  EDC
	   ED
	    E
*/