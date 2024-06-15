package com.arrays.java;

public class PlayWithArrays {

	public static void main(String[] args) {
		/*
		 * int[] arr = new int[10]; System.out.println(arr[0]); String[] stringArray =
		 * new String[10]; System.out.println(stringArray[0]); char[] chrArray = new
		 * char[10]; System.out.println(chrArray[0]); float[] floatArray = new
		 * float[10]; System.out.println(floatArray[0]); byte[] byteArray = new
		 * byte[10]; System.out.println("Byte array is " + byteArray[0]); short[]
		 * shortArray = new short[10]; System.out.println("short array is " +
		 * shortArray[0]); boolean []booleanArray = new boolean[10];
		 * System.out.println(booleanArray[0]); Object[] objectArray = new Object[10];
		 * System.out.println(objectArray[0]); arr[9] = 10; System.out.println(arr[9]);
		 * arr = new int[10]; System.out.println(arr[9]); System.out.println(chrArray[0]
		 * = 97);
		 */
		int n = 6;
		int[] arr = new int[n];
		int j = 1;
    	for(int i = 0; i < arr.length; i++){
            arr[i] = j;
            if(i == n - 1 -i){
                return;
            }
            else{
                arr[n - 1 - i] = arr[i] + 1;
            }
            j = j + 2;
            }
		
		
		

	}

}
