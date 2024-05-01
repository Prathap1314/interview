package com.kodnest.interview;

import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("enter the  number or value");
		
		String s =input.next();
		String temp =s;
		String a=cal(s);
		
		if(temp.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}
	
	static String cal(String s)
	{
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
		reversed =reversed+s.charAt(i);
		
		}
		return reversed;
		
		
	}
	
}


