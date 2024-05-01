package com.kodnest.oneDemi;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);

		System.out.println("user please enter the size of an array");

		int size =s.nextInt();

		int[] a=new int[size];


		System.out.println("user enter"+size+"elements");

		for(int i=0;i<=size-1;i++) {

			a[i]=s.nextInt();	

		}
		System.out.println("elements are:");
                    


		for(int i=0;i<=size-1;i++) {

			System.out.println(a[i]);			
		}




	}

}
