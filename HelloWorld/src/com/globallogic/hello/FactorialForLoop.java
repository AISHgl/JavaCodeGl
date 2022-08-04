//Java program to calculate a Factorial of a number
package com.globallogic.hello;

public class FactorialForLoop {
	
	public static void main(String args[]) {
		
		int n=4;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of " +n+ " is: "+ fact);
	     }   

}
