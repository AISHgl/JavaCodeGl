package com;

public class employee {

	[11:05 AM, 7/22/2022] Saurbh JSSGL H: class NameSortComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
		

	public class EmployeeList {
		static ArrayList<Employee> list = new ArrayList<>();
		static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		public static void main(String[] args)throws IOException {
			System.out.println("1- Add Employee");
			System.out.println("2- Delete Employee by index");
			System.out.println("3- Delete Employee by name");
			System.out.println("4- Search Employee");
			System.out.println("5- Update Employee");
			System.out.println("6- Sort List");
			System.out.println("7- Sum of salaries of all employees");
			System.out.println("8- Highest Sal…
	[11:06 AM, 7/22/2022] Saurbh JSSGL H: same package me below colde add kr dena Employee.java name se
	[11:06 AM, 7/22/2022] Saurbh JSSGL H: class Employee implements Comparable<Employee>{
		String name;
		int salary;
		public Employee() {
		}
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee o) {
			return this.getName().compareTo(o.getName());
		}
	}
	
}
