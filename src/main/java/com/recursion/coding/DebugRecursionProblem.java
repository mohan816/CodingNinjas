package com.recursion.coding;

public class DebugRecursionProblem {
	
	public static int sumn(int n) {
		if(n == 0) {
			return 0;
		}
		int smallOutput = sumn(n - 1);
		int output = n + smallOutput;
		return output;
	}
	
	public static int factn(int n) {
		if(n == 1) {
			return 1;
		}
		int smallOutput = factn(n - 1);
		int output = n * smallOutput;
		return output;
	}
	
	public static int powern(int x, int n) {
		if(n == 1) {
			return x;
		}
		int smallOutput = powern(x, n - 1);
		int output = x * smallOutput;
		return output;
	}
	
	public static int count(int n){
		if(n == 0){
            return 0;
        }
        int count = 1;
        int smallOutput = count(n / 10);
        int output = count + smallOutput;
        return output;

}
	public static int fibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int fibo1 = fibo(n - 1);
		int fibo2 = fibo(n - 2);
		int output = fibo1 + fibo2;
		return output;
	}
	static boolean b;
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
          
         //int b = input[0];
        if(x == input[0]){
            b = true;
            return b;
        }
        else if(input.length == 1 &&  x != input[0]) {
        	b = false;
        	return b;
        }
         int[] arr = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            arr[i - 1] = input[i];
        }
        checkNumber(arr, x);
        return b;
	}

	public static void main(String[] args) {
		//int output = sumn(3);
		//int output = factn(4);
		//int output = powern(4, 3);
		int output = fibo(5);
		System.out.println(output);
		//int[] arr = {34, 57, 82, 61, 70};
		//int[] arr = {34, 57, 82, 61, 65, 35, 82, 27, 36, 12, 6, 40, 66, 99, 25, 29, 22, 25, 12, 24, 65, 15, 5, 43, 28, 33, 76, 32, 13, 95, 22, 84, 71, 23, 28, 7, 65, 94, 18, 47, 9, 42, 61, 73 };
		//boolean b = checkNumber(arr, 80);
		//System.out.println(b);
		

	}

}
