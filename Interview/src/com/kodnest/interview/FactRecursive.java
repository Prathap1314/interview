package com.kodnest.interview;



public class FactRecursive {
    
public static void main(String[] args) {
	
	fact(3);
}
static int count=0;

static int fact(int n) {

	System.out.println(count);
	if(n==0) {
		return 1;
		
	}
	System.out.println("count>>"+count++);
	return n*fact(n-1);
}
}