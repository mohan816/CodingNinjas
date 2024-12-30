package com.recursion.coding;

public class AllIndexesOfX {
	/*
	 * 1) We have to find all the indexes of x, then have to return the output array with the index values.
	 * 2) Using recursion, we have to solve this problem
	 * 3) We have to iterate from index 0 and reach till arr.length, once we reached arr.length then have to return an empty array, it's
	 *    the base case.
	 * 4) Call the induction hypothesis till startIndex == arr.length
	 * 5) In the induction step, have to check arr[startIndex] == x, if it's true, then create new array with the length of smalloutput + 1
	 *    and assign the startIndex value to new array 0th index. Then iterate the smallOutput and assign it's values to the new array
	 *    and return the new array.
	 * 6) Finally return the smallOutput.
	 */
     public static int[] allIndexes(int[] arr, int x) {
    	 return allIndexes(arr, x, 0);
     }
     
     public static int[] allIndexes(int[] arr, int x, int startIndex) {
    	 if(startIndex == arr.length)
    		 return new int[0];
    	 int[] smallOutput = allIndexes(arr, x, startIndex + 1);
    	 if(arr[startIndex] == x) {
    		 int[] output = new int[smallOutput.length + 1];
    		 output[0] = startIndex;
    		 for(int i = 0; i < smallOutput.length; i++)
    			 output[i + 1] = smallOutput[i];
    		 return output; 
    	 }
    	 return smallOutput;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] result = allIndexes(new int[] {1, 2 ,3 ,4 ,3, 2, 2 ,1, 9}, 2);
        for(int index: result)
        	System.out.print(index+" ");
	}

}
