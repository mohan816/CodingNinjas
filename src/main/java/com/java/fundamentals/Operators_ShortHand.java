package com.java.fundamentals;

public class Operators_ShortHand {
public static boolean checkMember(int n){
        int a = 0; int b = 1;
        int c = 0;
        for(int i = c; i <= n; i++){
            if(c <= n){
                c = a + b;
                a = b;
                b = c;
                if(c == n){
                    return true;
                }
            }
            if(c > n){
                return false;
            }
        }
		return false;
}

	public static void main(String[] args) {
		
		boolean b =checkMember(6);
		System.out.println(b);
	}

}
