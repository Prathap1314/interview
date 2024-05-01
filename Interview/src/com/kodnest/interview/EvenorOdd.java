package com.kodnest.interview;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the number to find even or odd");
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
