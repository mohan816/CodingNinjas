package com.recursion.coding;

public class GeometricSum {
	
	/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
	*/
    
	/*
	 * 1) Here the idea is, we have to call the induction hypothesis till k == 0, because we have to add 1 then we have to perform the calculation
	 *    so that's the base case.
	 * 2) Induction hypothesis till k == 0
	 * 3) perform the induction step, if k = 3, then 1 + 1/2(2^1) + 1/4(2^2) + 1/8(2^3)
	 * 4) To calculate the power we have to call the power function	 */
	
	public static double findGeometricSum(int k) {
		if(k == 0)
			return 1.0;
		double smallOutput = findGeometricSum(k - 1);
		return smallOutput + 1/calculatePower(k, 2);
	}
	
	public static double calculatePower(int k, int num) {
		if(k == 1)
			return 2;
		double smallOutput = calculatePower(k - 1, num);
		return smallOutput * num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGeometricSum(4));

	}

}
