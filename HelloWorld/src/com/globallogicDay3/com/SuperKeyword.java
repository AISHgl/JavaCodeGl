package com.globallogicDay3.com;

public class SuperKeyword {

}

/////////////////////////////////
//Sir// kaa code//


class A {

	int id;

	
	
	public A()
	{
		
	}
	public A(int id,String name)
	{

	}

	public void printA() {
		System.out.println("class A" + id);
	}

}
//perform the inheritance : it will extends the base class properites to child class

//use extends keyword and then class Name
class B extends A {
	
	public B(int id) {
		//it wll call the class a constructor
		super(10,"string");
		
		//super.id;
		// TODO Auto-generated constructor stub
	}

	public void printB() {
		
		//calling the class a method using the super keyword
		super.printA();
		//calling the variable of clas a using super keyword
		System.out.println("class B"+super.id);
	}
}
===================
class C {

}
//

//keep for main method
public class MyInheritance {

	public static void main(String[] args) {

		/*
		 * A a=new A(); a.printA();
		 */

		B b = new B(10);
		// coming from class b
		b.printB();
		// coming from class A method
		b.printA();
           //super. not allowed here
		// class A variable
		System.out.println(b.id);

	}
}