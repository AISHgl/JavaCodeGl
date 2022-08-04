package com.globallogic.hello;

//name which is used to identify anything
//can be used with class
//can be used with method

//identifier is case sensitive

//Rule:
//Identifier will start with small case
//Next word will be Capital
public class MyIdentifier {
    //class Identifier
	//class variable
	
	String firstName;
	String 1lastName; // this ideantifier gives error
	String $middlename;//this is acceptable
	
	int salary;
	int $salary; //  with dollar identifier possible
	int 123salary; //not possible
	int -hire; //not possible identifier
	int _hello; // with hyphen identifier is possible
	
	
	//Method Identifier :sum
	public static void sum() {
}

	public static void Main(String args[]) {} //main is also a identifier function
