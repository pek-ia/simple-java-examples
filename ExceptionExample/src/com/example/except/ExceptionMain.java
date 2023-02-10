package com.example.except;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionMain {

	static double evalFraction(int num, int den) throws Exception {

	    if (den == 0) 
         throw new Exception("denominators must not be zero!");

	    return ((double)num)/den;	
	}


	public static void main(String[] args) {
	    int a = 239, b = 0;
	    double result = 0.0;

	    try {

	        result = evalFraction(a, b);
	        System.out.println("result is " + result);

	    } catch (Exception e) {

	        Logger.getGlobal().log( Level.SEVERE, 
                     "You CAN'T Do THAT!!: " + e.getMessage());

	    }		
	}
	

}
