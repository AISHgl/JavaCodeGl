package com.globallogicDay3.com;

public class AbstractClass {

}


------------

//ABSTRACTIONn

//Abstraction --it is concept or idea which needs to implements 

//interface--it is used to perform the Abstraction in java
  //it will have the abstract method only --that means we will have the concept only

 //by default interface is abstract
 //by default interface method are also abstract
abstract interface Mobile
{
	abstract public void calling();
	abstract public void sendSMS();
}
//calling and sendsms
class Apple implements Mobile
{

	//implement the 
------------------------
@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms Apple");
	}
	
}
class Sumsung implements Mobile
{

	//implement the unimplemented method
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling Sumsung");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms Sumsung");
	}
	
}
--------------------------
public class MyInterface {

	public static void main(String[] args) {
		
		Apple apple=new Apple();
		apple.calling();
		apple.sendSMS();
		
		//we can create object of interface and give the reference of any implemented class
		Mobile note=new Sumsung();
		note.calling();
		note.sendSMS();
		//you must give the implementation of class or method
		
		Mobile b=new  Mobile() {
			
			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				
			}
	
			
			
			
			
			//Abstract Class
Ravinder kumar3:43 PM
package com.globallogic.day3;

//abstract class : i can have the abstract and non abstract method in the abstract class
//calling
//sendsms()
//brand ()  abstract
abstract class ChinaMobile {
	public void calling() {
		System.out.println("calling ");
	}

	public void sendsms() {
		System.out.println("send sms");

	}

	abstract void brand();
}
//class will be always extends
class Mircomax extends ChinaMobile {

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("
}

}

public class AbstractClass {
public static void main(String[] args) {
	Mircomax mircomax=new Mircomax();
	mircomax.brand();
	mircomax.calling();
	mircomax.sendsms();
	
}
}