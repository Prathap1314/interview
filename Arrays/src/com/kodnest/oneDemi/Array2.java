package com.kodnest.oneDemi;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("user please enter the size of an array");
		
		byte size =s.nextByte();
		
		byte[] a=new byte[size];
		
		
		System.out.println("user enter"+size+"elements");
		
		for(byte i=0;i<=size-1;i++) {
			
			a[i]=s.nextByte();			
		}
		System.out.println("elements are:");
		
      for(byte i=0;i<=size-1;i++) {
			
			System.out.println(a[i]);			
		}
		
		
		
		
	}

}
