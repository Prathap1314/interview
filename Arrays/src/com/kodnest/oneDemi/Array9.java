package com.kodnest.oneDemi;

import java.util.Scanner;

public class Array9 {
	
	public static void main(String[] args) {
		
		int []a= {10,28,30,40,50};
		
		
		for(int i=0;i<=a.length-1;i++) {
			if((a[i]%5==0) ||(a[i]%3==0)){
				System.out.println(a[i]);
			}
		}
		
		
		
		
	}

}
