package com.Globallpgic.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		try {
			
			//URL for the DB
			String url="jdbc:mysql://localhost:3306/YUHU";
			
			//DB login credentials
			String userName="root";
			String password="admin";
			
			//creating connections with DB
			Connection connection = DriverManager.getConnection(url,userName,password);//yaad krne wali line
			Statement statement = connection.createStatement();

			//Sample data for employees TABLE:
			//65646 | JONAS | MANAGER | 68319 | 1991-04-02 | 2957.00 | NULL | 2001 |
			//variable declare
			int empId;
			String empName;
			String jobName;
			int managerId;
			String hireDate;
			double salary;
			double commission;
			int dept_id;
			
			
			
			//SELECT
			String selectAllQuery="SELECT * FROM employee";
			//datatype //variable                
			ResultSet resultSet = statement.executeQuery(selectAllQuery);
			while(resultSet.next()) {
				
				empId=resultSet.getInt("emp_id");
				empName=resultSet.getString("emp_name");
				jobName=resultSet.getString("job_name");
				managerId=resultSet.getInt("manager_id");
				hireDate=resultSet.getString("hire_date");
				salary=resultSet.getDouble("salary");
				commission=resultSet.getDouble("commision");
				dept_id=resultSet.getInt("dept_id");
				
				//patern to print the row for table
				String row ="emp_id:"+ empId + ", "+
							"emp_name:"+ empName + ", "+
							"job_name:"+ jobName + ", "+
							"manager_id:"+ managerId + ", "+
							"hire_date:"+ hireDate + ", "+
							"salary:"+ salary + ", "+
							"commision:"+ commission + ", "+
							"dep_id:"+ dept_id;
				
				System.out.println(row);
			}
			
			//when error comes catch throws an eception //e is a variable
		} catch(Exception e) {
			e.printStackTrace();
		}
		
    }
}
