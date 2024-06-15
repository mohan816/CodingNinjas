package com.stacks.java;

import java.util.Stack;

public class MinimumBracketReversal {
	
	/*
	 * Pseudo code 1. If it is open bracket directly push in the stack 
	 * 2. If it is close bracket and the top of the stack is open bracket, then pop the top of the stack 
	 * 3. If it is close bracket and the top of the stack is close bracket, then push the close bracket to the stack
	 *  4. If it is close bracket and the stack is empty then push it to the stack.
	 */
	public static int countBracketReversals(String input) {
        int count = 0;
        Stack<String> s = new Stack<>();
        if(input.length() % 2 != 0){
            return -1;
        }
        else{
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == '{'){
                    s.push("{");
                }
                else if((input.charAt(i) == '}') && (s.isEmpty())){
                    s.push("}");
                }
                else if((input.charAt(i) == '}') && (!s.isEmpty()) && (s.peek() == "{")){
                        s.pop();
                    }
                else if((input.charAt(i) == '}') && (!s.isEmpty()) && (s.peek() == "}")){
                        s.push("}");
                    } 
                }
        }
        while(!s.isEmpty()){
            String c1 = s.pop();
            String c2 = s.pop();
            if(c1 == c2){
                count = count + 1;
            }
            else{
                count = count + 2;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		String s ="}}}{{{";
		int count = countBracketReversals(s);
		System.out.println(count);
	}

}
