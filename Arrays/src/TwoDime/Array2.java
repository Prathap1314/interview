package TwoDime;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		int sum=0;
		
		int [][]a= new int[4][4];
		
		a[0][0]=3;
		a[0][1]=41;
		a[0][2]=74;
		a[0][3]=14;
		
		a[1][0]=13;
		a[1][1]=7;
		a[1][2]=91;
		a[1][3]=4;
		
		a[2][0]=8;
		a[2][1]=94;
		a[2][2]=67;
		a[2][3]=25;
		
		a[3][0]=41;
		a[3][1]=6;
		a[3][2]=18;
		a[3][3]=30;
		
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=0;j<=a[i].length-1;j++) {
			//to print even elements in the array	
//			if(a[i][j]%2==0) {
//				
//				System.out.println("even elements are:"+a[i][j]);
				
				
				if(i==j) {
					System.out.println("the principle diaogonal elements are:"+a[i][j]);
				sum=sum+a[i][j];
				
			}
				
			}
			
		}
		System.out.println("sum of the all the elements"+sum);
		
	
		

	}

}
