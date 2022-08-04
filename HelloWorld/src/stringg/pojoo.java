package stringg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Employee ek pojo class h
class Employe{
	private String name;
	private int salary;
	public Employe(String name, int salary) {
		super();
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
		return "Employe [name=" + name + ", salary=" + salary + "]";
	}
	public boolean isSame(Employe e) {
		if(this.name.equalsIgnoreCase(e.name) && this.salary==e.salary)
			return true;
		return false;
	}
	
}

public class pojoo {
	
static Set<Employe> surf =new HashSet<>();
static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String args[]) throws IOException{
		
			System.out.println("1- Add Employee");
			System.out.println("2- Remove Employee");
			System.out.println("3- Search Employee");
			System.out.println("4- Sort List");
			System.out.println("5- Display");
			
			System.out.println("6- Exit");
			boolean loop=true;
			while(loop) {
				String name;
				int salary;
				System.out.println("Enter 1,2,3,4,5 or 6");
				int choice = Integer.parseInt(BR.readLine());
				switch(choice) {
					case 1:
						System.out.println("Enter name");
						name=BR.readLine();
						System.out.println("Enter salary");
						salary = Integer.parseInt(BR.readLine());
						add(name,salary);
						break;
					case 2:
						if(surf==null || surf.size()==0) {
							System.out.println("No Employees");
							break;
						}
						System.out.println("Enter the name");
						name=BR.readLine();
						System.out.println("Enter salary");
						salary = Integer.parseInt(BR.readLine());
						remove(name,salary);
						break;
					case 3:
						if(surf==null || surf.size()==0) {
							System.out.println("No Employees");
							break;
						}
						System.out.println("Enter the name");
						name=BR.readLine();
						System.out.println("Enter salary");
						salary = Integer.parseInt(BR.readLine());
						search(name,salary);
						
						break;
					case 4:
						if(surf==null || surf.size()==0) {
							System.out.println("No Employees");
							break;
						}
						sort();
						break;
					case 5:
						if(surf==null || surf.size()==0) {
							System.out.println("No Employees");
							break;
						}
						display();
						break;
					case 6:
						loop=false;
						System.out.println("Exiting....");
						break;
					default:
						System.out.println("Wrong input! Try again.");
				}
			}
			System.out.println("Exitied program.");
		}
	
	
		private static void display() {
			Iterator<Employe> it= surf.iterator();
			while(it.hasNext())
				System.out.println(it.next());
			
		}
		private static void sort() {
			display();
			List<Employe> list= new ArrayList<>();
			Iterator<Employe> it= surf.iterator();
			while(it.hasNext())
				list.add(it.next());
			Collections.sort(list,(a,b)-> a.getName().compareTo(b.getName()));
			for(Employe e: list)
				surf.add(e);
			list.clear();
			display();
		}
		private static void search(String name, int salary) {
			Employe newE = new Employe(name,salary);
			Iterator<Employe> it= surf.iterator();
			boolean hasE=false;
			while(it.hasNext())
				if(it.next().isSame(newE)) {
					System.out.println("Employee is present");
					break;
				}
			if(!hasE)
				System.out.println("Employee is present");
		}
			
		private static void remove(String name, int salary) {
			Employe newE = new Employe(name,salary);
			Iterator<Employe> it= surf.iterator();
			boolean hasE=false;
			Employe e;
			while(it.hasNext()) {
				e=it.next();
				if(e.isSame(newE)) {
					hasE=true;
					surf.remove(e);
					break;
				}
			}
			if(hasE)
				System.out.println("Removed: "+newE);
			else
				System.out.println("Employee does not Exisit!!!");
		}
		private static void add(String name, int salary) {
			Employe newE = new Employe(name.toUpperCase(),salary);
			Iterator<Employe> it= surf.iterator();
			boolean hasE=false;
			Employe e;
			while(it.hasNext()) {
				e=it.next();
				if(e.isSame(newE)) {
					hasE=true;
					break;
				}
			}
			if(hasE)
				System.out.println("Employee already exists");
			else {
				surf.add(newE);
				System.out.println("Added: "+newE);
			}
		}
	
	}
	
	

