package com.java.fundamentals;

import java.util.Scanner;
public class HalfDiamond {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int n1 = n;
        int n2 = n - 1;
        int i = 1;
        System.out.println('*');
        while(i <= n1){
            System.out.print('*');
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j = j + 1;
            }
            int a = 1;
            int b = i;
            while(a < i){
                System.out.print(b - a);
                a = a + 1;
            }
            System.out.print('*');
            System.out.println();
            i = i + 1;
        }
        
        
    }
}
