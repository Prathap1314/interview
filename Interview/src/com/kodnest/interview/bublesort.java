package com.kodnest.interview;

import java.util.Scanner;

public class bublesort {

	public static void main(String[] args) {
		{

			Scanner s = new Scanner(System.in);
			System.out.println("user plese enter size of an array");
			int n=s.nextInt();
			int a[]=new int[n];

System.out.println("user plese enter elemnts");
			for(int i=0;i<a.length;i++) {
				a[i]=s.nextInt();


				for(int k=0;k<a.length;k++) {
					for(int j=0;j<a.length-i-1;j++) {
						if(a[j]<a[j+1]) {
							int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
			}
		}

}
}