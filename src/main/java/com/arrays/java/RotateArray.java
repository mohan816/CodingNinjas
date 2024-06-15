package com.arrays.java;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,3,6,11,12,17};
		int d = 4;
		rotate(arr, d);
}
	public static void rotate(int[] arr, int d) {
        int n = arr.length;
    	for(int i=0; i<d; i++){
            int temp = arr[0];
            for(int j=1; j<=n; j++){
                if(j==n){
                    arr[j-1] = temp;
                }
                else{
                    arr[j-1] = arr[j];
                }
            }
        }
    }

}
