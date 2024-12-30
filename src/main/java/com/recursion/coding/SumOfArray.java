package com.recursion.coding;

public class SumOfArray {
	
	/*
	 * Note: Always we have to think about PMI, Principal Mathematical Induction which means
	 *       have to prove for the smaller value, Then we have to assume for n - 1
	 *       then we have to prove for n
	 *       
	 *       1) Base Condition -> It has to true for smaller value
	 *       2) Induction Hypothesis -> This is an assumption
	 *       3) Induction step -> We have to prove this one 
	 */
	
	/*
	 * 1) If length is 1 then return arr[0], because if the length is 1 which means one value is there in the array that
	 * also present in the zeroth index (Proving the base condition)
	 * 2) Then the induction hypothesis
	 * 3) Prove the induction step, based on the length we are getting the value in the array, so used arr[length] + smallOutput.
	 * 
	 */
	
	public static int sumOfArray(int[] arr, int length) {
		if(length == 1)
			return arr[0];
		if(length == 0)
			return 0;
		int smallOutput = sumOfArray(arr, length - 1);
		return arr[length - 1] + smallOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sumOfArray(arr, arr.length));
		

	}

}
