package com.stacks.java;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
	/*
	 * The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards)
	 *  for which the price of the stock was less than today's price.
    Explanation:
    For the stock prices [100, 80, 60, 70, 60, 75, 85], the span of each day is calculated by counting consecutive previous days with a price less
     than or equal to today's price:

Day 1 (100): No previous days, span = 1.
Day 2 (80): Less than 100, span = 1.
Day 3 (60): Less than 80, span = 1.
Day 4 (70): Greater than 60, span = 2.
Day 5 (60): Less than 70, span = 1.
Day 6 (75): Greater than 60, 70, and 60, span = 4.
Day 7 (85): Greater than all previous days, span = 6.
Final spans: [1, 1, 1, 2, 1, 4, 6].
	 */
	
	/*
	 * Pseudocode:
	 * 1) Create a Stack, at first push arr[0] to the Stack and in the result arr at 0th index enter 1.
	 * 2) Now iterate the arr and check the peek() of the Stack is smaller or not, If not then push current arr index
	 *    value to the Stack. If the peek() is smaller then, pop() it and put it in the arraylist till the peek() value 
	 *    greater or until the Stack become empty.
	 * 3) If stack becomes empty then in the result arr, in the respective index position add arrlist.szie() + 1.
	 * 4) Then push all the values back to the stack and remove all the elements in the arraylist continue this process till we iterate entire input arr.
	 * 5) Suppose, if the stack is not empty and we found peek() greater than array, then also follow the same process arrList.size() + 1,
	 *    and remove all the elemment in the array list and push into the Stack
	 */
	
	//Brute force approach
	
	public static int[] stockSpan(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[arr.length];
		int index = 0;
		result[index++] = 1;
		stack.push(arr[0]);
		boolean flag = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] <= stack.peek()) {
				stack.push(arr[i]);
				flag = true;
			}
				
			else if(!stack.isEmpty() && stack.peek() < arr[i]){
				while(!stack.isEmpty() && stack.peek() < arr[i])
					list.add(stack.pop());
				result[index++] = list.size() + 1;
				for(int j = list.size() - 1; j >= 0; j--)
					stack.push(list.remove(j));
				stack.push(arr[i]);
			}
			    if(flag == true) {
				result[index++] = 1;
				flag = false;
			    }
		     	
		}
		return result;
	}
	
	//optimized approach
	/*
	 * 1) Instead of push the values of input arr into the stack, we have to push the index positions
	 * 2) Create the result arr of size arr.length, and put 1 in the 0th index of result array
	 * 3) Push 0 in the stack
	 * 4) Then iterate the input arr till it reaches length - 1
	 * 5) In the each iteration, check peek is lesser than arr[i] and stack is not empty, if the condition
	 *    is true pop() the top element and continue this loop till any one condition is false.
	 * 6) if the stack is empty, then in the result[] add i + 1
	 * 7) If the stack is not empty, then in the result[] add i-stack.peek();
	 * 8) And in each iteration push the index position into the stack.
	 */
    public static int[] stockSpanOptimized(int[] arr) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int[] result = new int[arr.length];
    	int index = 0;
    	stack.push(0);
    	result[index++] = 1;
    	for(int i = 1; i < arr.length; i++) {
    		while(!stack.isEmpty() && arr[i] > arr[stack.peek()])
    			   stack.pop();
    		if(stack.isEmpty())
    			result[index++] = i + 1;
    		else
    			result[index++] = i - stack.peek();
    		stack.push(i);	
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr = {100, 80, 60, 70, 60, 75, 85};
		int[] arr = {60, 70, 80, 100, 90, 75, 80, 120};
		int result[] = stockSpanOptimized(arr);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i]+" ");

	}

}
