package com.flowchart;

public class GivenNumberIsFibonnaiOrNot {
	
	public static void fiboOrNot(int n) {
		int a=0; int b=1;
		for(int i=0; i<=n; i++) {
			int c=a+b;
			if(c==n) {
				System.out.println("It is a fibonnaci number "+n);
				break;
			}
			a=b;
			b=c;
			if(c>n) {
				System.out.println("It is not a fibonnaci number");
				break;
			}
		}
}

	public static void main(String[] args) {
		fiboOrNot(21);

	}

}
