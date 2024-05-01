package com.kodnest.interview;

import java.util.Scanner;

public class Positiveornegi {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("User enter number");
		int num =s.nextInt();
		if(num>0)
		{
			System.out.println("positive nuber");
		}

		else if(num<0) {
			System.out.println("negitive number");
		}

		else {
			System.out.println("Zero");
		}
	}

}
