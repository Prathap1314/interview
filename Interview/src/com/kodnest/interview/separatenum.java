package com.kodnest.interview;

import java.util.Scanner;

public class separatenum {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("user please enter number");
		int n =s.nextInt()
;	
		int rem,quo,sum=0;
	while(n>0) {
		rem =n%10;
		quo =n/10;
		n=quo;
		System.out.println(rem);
		//sum =sum+rem;
	}
	System.out.println(sum);
	
	
	
	
	}

}
