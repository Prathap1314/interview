package com.kodnest.oneDemi;

import java.util.Scanner;

public class Array12 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum=0;
		
		
		System.out.println("user please enter size of an array");
		int size=s.nextInt();
		int[]a=new int[size];
		
		
		System.out.println("user please enter:"+size+" of elements");
		for(int i=0;i<=size-1;i++) {
		 a[i]=s.nextInt();
		}
		System.out.println("elements are:");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum:"+sum);
		
		
	}
}

