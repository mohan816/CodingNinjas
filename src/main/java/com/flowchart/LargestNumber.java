package com.flowchart;

public class LargestNumber {
	

	public static void main(String[] args) {
		int[] a= {10,20,5,30,40,120,58,890};
		int largestNumber=0;
		int firstNumber=0;
		
		for(int i=0; i<a.length;i++) {
			largestNumber = -1;
			firstNumber = a[i];
			if(firstNumber>largestNumber) {
				largestNumber=firstNumber;
			}
		}
		System.out.println("The largest number is "+largestNumber);

	}

}
