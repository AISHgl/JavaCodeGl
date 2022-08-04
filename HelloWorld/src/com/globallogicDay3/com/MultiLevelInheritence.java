package com.globallogicDay3.com;

	class ClassA1 {
		void printA1(){
			System.out.println("A1");
		}
	}
	class ClassB1 extends ClassA1{
		void printB1() {
			System.out.println("B1");
		}
	}

	class ClassC1 extends ClassB1{
		void printC1() {
			System.out.println("C1");
		}
	}

	public class MultiLevelInheritence {
		public static void main(String[] args) {
			ClassC1 classChild = new ClassC1();
			classChild.printA1();
			classChild.printB1();
			classChild.printC1();
		}
	}

