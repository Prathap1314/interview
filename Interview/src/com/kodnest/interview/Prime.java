package com.kodnest.interview;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("user please enter the number");
		int n =s.nextInt();
		
		int count=0;int rem=0;
		
		for(int i =1;i<=n;i++) {
			rem =n%i;
			if(rem==0) {
				System.out.println(i);
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
