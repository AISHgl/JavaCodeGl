package com.globallogicDay3.com;

public class eNCAPSULATION {

}



//encapsulation : it says there is a single unit and private propteries which can be access by class method only
//fully encapsulated class
public class MyEncapsulation {

	public MyEncapsulation(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	private String name;
	private int id;

	public void print() {
		System.out.println("name " + this.name);
		System.out.println("id " + this.id);
	}

}