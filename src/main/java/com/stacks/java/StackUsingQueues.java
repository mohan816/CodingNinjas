package com.stacks.java;

public class StackUsingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
         for(int i = 1; i <= 5; i++)
        	 stack.push(i);
         System.out.println(stack.pop()); //5
         System.out.println(stack.top()); //4
         System.out.println(stack.pop()); //4
         System.out.println(stack.pop()); //3
         System.out.println(stack.pop()); //2
         System.out.println(stack.top()); //1
         System.out.println(stack.pop()); //1
         System.out.println(stack.top()); //-1
	}

}
