package com.java.fundamentals;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	int localVariable = 0;
	
	//int n = 1;
	while( i <= userInput) {
		int j = 1;
		while(j <= userInput + userInput) {
			if(i == 1) {
				
			if(j <= userInput) {
				System.out.print(j);
				j = j + 1;
			   localVariable = userInput;
			}
			else if(userInput > 0) {
				System.out.print(localVariable);
				localVariable = localVariable - 1;
				j = j + 1;
			}	
	}
			else if(i == 2) {
				if(j <= userInput) {
					if(j <= 3) {
						System.out.print(j);
						j = j + 1;	
					}
					else if (j > 3) {
						System.out.print('*');
						j = j + 1;
					}
				   localVariable = userInput;
				}
				else if(userInput > 0) {
					if(localVariable == 4) {
						System.out.print('*');
						localVariable = localVariable - 1;
						j = j + 1;
					}
					else{
						System.out.print(localVariable);
						localVariable = localVariable - 1;
						j = j + 1;
					}
					
				}
			}
			else if(i == 3) {
				if(j <= userInput) {
					if(j <= 2) {
						System.out.print(j);
						j = j + 1;	
					}
					else if (j > 2) {
						System.out.print('*');
						j = j + 1;
					}
				   localVariable = userInput;
				}
				else if(userInput > 0) {
					if(localVariable == 4) {
						System.out.print('*');
						localVariable = localVariable - 1;
						j = j + 1;
					}
					
					   else{
						   if(localVariable == 3)
						   { 
							   System.out.print('*');
							   localVariable = localVariable -1;  
							   j = j + 1;
					   }
						   else {
							   System.out.print(localVariable); 
							   localVariable = localVariable - 1; 
							   j = j + 1;
						   }							 
						  }
						    }
				}
			else if(i == 4) {
				if(j <= userInput) {
					if(j <= 1) {
						System.out.print(j);
						j = j + 1;	
					}
					else if (j > 1) {
						System.out.print('*');
						j = j + 1;
					}
				   localVariable = userInput;
				}
				else if(userInput > 0) {
					if(localVariable == 4) {
						System.out.print('*');
						localVariable = localVariable - 1;
						j = j + 1;
					}
					
					   else if(localVariable == 3)
						   { 
							   System.out.print('*');
							   localVariable = localVariable -1;  
							   j = j + 1;
					   }
					   else if(localVariable == 2){
						   System.out.print('*');
						   localVariable = localVariable -1;  
						   j = j + 1;
					   }
						   
						
						  else
						  { System.out.print(localVariable); localVariable = localVariable - 1;
						  j = j + 1; 
						  }
						 						 
						  }
						    }
				}
		System.out.println();
		i = i + 1;
			}
	
			}
		
	}
	
	






