package com.java.fundamentals;

public class TwoRowPattern {
	
	public static void twoRowPattern(int n) {
		int i = 1, row = 1;
		//First row logic
		while(row <= 1) {
			System.out.print(i+" ");
			int j = i + 3;
			while(j <= i + 3 && j <= n) {
				System.out.print(j+" ");
				j++;
			}
			i = j;
			if(j > n) {
				System.out.println();
				row++;
				
			}
		}
		// second row logic
		i = 2; row = 2;
		
		  while(row <= 2){ 
			  System.out.print(i+" "); 
			  int k = i + 1;
			  int j = i + 1;
			  while(j <= k && j <= n){ 
				  System.out.print(j+" "); 
				  i = j + 3;
				  j++; 	   
			} 
			  if(i > n) { 
				  row++; 
		} 
		}
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoRowPattern(8);

	}

}
