
//package com.globallogic.jdbc;
package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSQL {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//URL for the DB
			String url="jdbc:mysql://localhost:3306/YUHU";
			
			//DB login credentials
			String userName="root";
			String password="admin";
			
			//creating connections with DB
			Connection connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();

			//Sample data for employees TABLE:
			//65646 | JONAS | MANAGER | 68319 | 1991-04-02 | 2957.00 | NULL | 2001 |
			int empId=66123;
			String empName="JACK";
			String jobName="MANAGER";
			int managerId=68319;
			String hireDate="1991-07-08";
			double salary=2898.00;
			double commission=1500.00;
			int dept_id=1001;
			
			
			//INSERT
			String insertQuery = "INSERT INTO employee VALUES (66123,'JACK','MANAGER',68319,'1991-07-08',2898.00,1000.00,1001)";
			statement.execute(insertQuery);
			
			//UPDATE
			String updateQuery = "UPDATE employee SET SALARY=2300.00 WHERE emp_id=67832";
			statement.executeUpdate(updateQuery);
			
			//DELETE
			String deleteQuery = "DELETE FROM employee WHERE emp_id=66928";
			statement.executeUpdate(deleteQuery);
			
			//SELECT
			String selectAllQuery="SELECT * FROM employee";
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
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}