package com.oops2.com;

public class ExceptionHandling extends Exception {
	
	public static void exception() throws Poruki {
		try{
			int b = 0;
			System.out.print(false);
		    throw new Poruki();
		}
		catch(Poruki p){
			System.out.println("It is a known poruki exception");
		}
		
	}

	public static void main(String[] args) throws Poruki {
		
      exception();
	}

}
