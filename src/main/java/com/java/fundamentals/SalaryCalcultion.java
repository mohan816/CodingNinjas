package com.java.fundamentals;
import java.util.Scanner;
import java.lang.Math;
public class SalaryCalcultion {
	
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double basic = sn.nextDouble();
        char allowance = sn.next().charAt(0);
       double hra = basic/(100/20);
       System.out.println(hra);
       System.out.println(0.2 * basic);
        double da = basic/(100/50);
        double pf = basic/(100/11);
        if(allowance == 'A'){
            
          long ro = Math.round((basic + hra + da + 1700) - pf) ; 
          System.out.println((basic + hra + da + 1700) - pf);
          System.out.println(ro);
        }
        else if(allowance == 'B'){
            System.out.println(Math.round(basic + hra + da + 1500) - pf);  
        }
        else{
            System.out.println(Math.round(basic + hra + da + 1300) - pf); 
        }
            
		

	}
}

