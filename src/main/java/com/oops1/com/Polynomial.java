package com.oops1.com;

public class Polynomial {
    public int[] data;
    public int degree;

public Polynomial(){
    data = new int[5];
   // degree = 0;
}

public void doubleSize(){
   // if(degree == data.length || degree > data.length){
        int[] temp = data;
        data = new int[degree + 1];
    for(int i = 0; i < temp.length; i++){
        data[i] = temp[i];
    }
    }
    
/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
 *  is already present in the polynomial then previous coefficient is replaced by
 *  new coefficient value passed as function argument
*/
public void setCoefficient(int degree, int coeff){
    this.degree = degree;
   if(this.degree < data.length) {
	   data[this.degree] = coeff;
       }
       else if(this.degree == data.length || this.degree > data.length){
           doubleSize();
           data[this.degree] = coeff;   
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

/*
 * } }
 */
public Polynomial add(Polynomial p){
	//Polynomial third = new Polynomial();
    if(p.data.length > this.data.length){
       int a = p.data.length - this.data.length;
        int temp[] = data;
        data = new int[temp.length + a];
        for(int i = 0; i < data.length; i++) {
        	if(i <= temp.length-1) {
        		data[i] = temp[i] + p.data[i];
        	}
        	else {
        		data[i] = p.data[i];
        	}
        }
}
else if(p.data.length <= this.data.length) 
  { 
	  int temp[] = data; 
	  data = new int[temp.length]; 
	  for(int i = 0; i < data.length; i++)
	  { 
		  data[i] = temp[i] + p.data[i];
  }
	  }
 
   
    return this;
}
public Polynomial sub(Polynomial p){
	//Polynomial third = new Polynomial();
    if(p.data.length > this.data.length){
       int a = p.data.length - this.data.length;
        int temp[] = data;
        data = new int[temp.length + a];
        for(int i = 0; i < data.length; i++) {
        	if(i <= temp.length-1) {
        		data[i] = temp[i] - p.data[i];
        	}
        	else {
        		data[i] = -p.data[i];
        	}
        }
}
else if(p.data.length <= this.data.length) 
  { 
	  int temp[] = data; 
	  data = new int[temp.length]; 
	  for(int i = 0; i < data.length; i++)
	  { 
		  data[i] = temp[i] - p.data[i];
  }
	  }
 
   
    return this;
}
}
