package com.oops.coding;

public class Polynomial {
        int[] data = new int[5];
        
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
       if(this.data.length > degree) {
    	   for(int i = 0; i <this.data.length; i++) {
        	   if(i == degree) {
        		  this.data[i] = coeff;
        		  break;
        	   }
           }
       }
       else if(this.data.length <= degree) {
    	   int temp[] = this.data;
    	  this.data = new int[degree + 1];
    	   for(int i = 0; i < temp.length; i++) {
    		  this.data[i] = temp[i];
    	   }
    	   for(int i = temp.length; i < this.data.length; i++) {
    		   if(i == degree) {
    			  this.data[i] = coeff;
    		   }
    	   }
       }
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i = 0; i <  this.data.length; i++) {
			if(this.data[i] == 0) {
				continue;
			}
			else {
				System.out.print(this.data[i]+"x"+i+" ");
			}
		}
		}

	
	//// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		//Polynomial third = new Polynomial();
		if(p.data.length >= this.data.length) {
			int temp[] = this.data;
			this.data = new int[p.data.length];
			for(int i = 0; i < p.data.length; i++) {
				if(i < temp.length) {
					this.data[i] = temp[i] + p.data[i];

				}
				else {
					this.data[i] = p.data[i];
				}


			}
		}
		else {
			/*
			 * int temp[] = this.data; this.data = new int[temp.length];
			 */
			for(int i = 0; i < this.data.length; i++) {
				if(i < p.data.length) {
					this.data[i] = this.data[i] + p.data[i];
}
				
			
		}
		}
		
		return this;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		if(this.data.length >= p.data.length) {
			for(int i = 0; i < this.data.length; i++) {
				if(i < p.data.length) {
					this.data[i] = this.data[i] - p.data[i];
				}
			}
		}
		else {
				int temp[] = this.data;
				this.data = new int[p.data.length];
				for(int i = 0; i < this.data.length; i++) {
				if(i < temp.length) {
					this.data[i] = temp[i] - p.data[i];
				}
				else {
					this.data[i] = p.data[i];
				}
			}
		}
			return this;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int temp[] = this.data;
		this.data = new int[temp.length + p.data.length];
		System.out.println(this.data.length);
		for(int i = 0; i < temp.length; i++) {
			int count = 1;
			for(int j = 0; j < p.data.length; j++) {
				if(i < temp.length && p.data[j] != 0 && temp[i] != 0) {
				this.data[i + count] = temp[i] * p.data[j];
				count++;
			}
		}
		}
		return this;
	}
}
