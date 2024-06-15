package com.java.fundamentals;

import java.util.Scanner;

public class Pattern10 {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int count = 1;
            while(j <= i){
                System.out.print(j);
                if(j == i){
                    System.out.print('=');
                    j = j + 1;
                }
                else{
                    System.out.print('+');
                    count = count + j + 1;
                    j = j + 1;
                }
                if(j > i){
                    System.out.print(count);
                }
                
            }
            System.out.println();
            i = i + 1;
        }
	}
}
