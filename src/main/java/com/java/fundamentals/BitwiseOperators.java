package com.java.fundamentals;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int reverse = 0;
        while(n > 0){
            int rem = n % 2;
            reverse = reverse * 10 + rem;
            n = n / 2;
        }
        System.out.println(reverse);
	}
		//System.out.println(decimal);
	}



