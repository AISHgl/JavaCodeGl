package com.globallogicDay3.com;

class A1{
	void printA1() {
		System.out.println("A1");
	}
}
class B2 extends A1{   //properties of A1 are inherited in B2 by extend Keyword
	void printB2() {
		System.out.println("B2");
	}
	
}
public class SingleInheritence{
	public static void main(String args[]) {
		
		B2 B2 = new B2();
		B2.printB2();
		B2.printA1();
		
	}
}



