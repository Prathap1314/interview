package TwoDime;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
	
		
//		a[0][0]=20;
//		a[0][1]=40;
//		a[0][2]=60;
//		a[0][3]=80;
//		a[0][0]=90;
//		
//		a[1][0]=12;
//		a[1][1]=14;
//		a[1][2]=15;
//		a[1][3]=17;
//		a[1][0]=18;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("user please enter number of classes");
		int m=s.nextInt();
		System.out.println("user please enter number of classes");
		int n=s.nextInt();
		
		
		int[][]a= new int[m][n];
		
		System.out.println("user please enter "+(m*n)+" students marks");
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=0;j<=a[i].length-1;j++) {
				
			 a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("the elements are:");
			
		for(int i=0;i<=a.length-1;i++) {
				
			for(int j=0;j<=a[i].length-1;j++) {
					
				 System.out.println(a[i][j]);
				 
				 sum=sum+a[i][j];
				}
			
		}
		
	}

}
