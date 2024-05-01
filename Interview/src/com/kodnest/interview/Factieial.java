package com.kodnest.interview;

import java.util.Scanner;

public class Factieial {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("user please eneter the number to find gfactorial of given number");
		int n=s.nextInt();
		int  fact =1;
		int  sum=0;
		 for(int i=n;i>=1;i--) {
			 
			 fact =fact*i;
			 sum=sum+i;
			 System.out.println(i);
			}
		 System.out.println("the"+sum);
		 System.out.println("the factorial of given number:"+fact); 
		 
	}

}
