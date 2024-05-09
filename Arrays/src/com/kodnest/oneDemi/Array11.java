package com.kodnest.oneDemi;

import java.util.Scanner;

public class Array11 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("user please enter size of an array");
		int size=s.nextInt();
		int[]a=new int[size];
		
		
		System.out.println("user please enter:"+size+" of elements");
		for(int i=0;i<=size-1;i++) {
		 a[i]=s.nextInt();
		}
		
		System.out.println("user please enter the element to be search");
		int ele =s.nextInt();
		
		boolean flag =false;
		for(int i=0;i<=a.length-1;i++) {
			
		
				if(ele==a[i]) {
					flag =true;
					break;
				}
				else {
					flag=false;
				}
				
		
		}
		
		if(flag==true) {
			System.out.println("element is present");
		}
		else  {
			System.out.println("element is not present");
		}
		
		
	}
}

