package com.klu;
import java.sql.*;
public class JDBCcrud {

	public static void main(String[] args) throws Exception {
		  String url="jdbc:mysql://localhost:3306/fsads3";
		  String usr="root";
		  String pwd="3945";
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection con = DriverManager.getConnection(url,usr,pwd);
		  System.out.println("Database Connection Established");
		  
		  Statement st = con.createStatement();
		  String createDept="create table if not exists Dept("+ "dept_id int primary key auto_increment,"+"dept_name varchar(20)"+")";
		  
		  st.execute(createDept);
		  System.out.println("Department table created");
		  
		  st.execute(
				  "CREATE TABLE IF NOT EXISTS Emp (" +
				  "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
				  "emp_name VARCHAR(15), " +
				  "sal DOUBLE, " +
				  "dept_id INT, " +
				  "FOREIGN KEY (dept_id) REFERENCES dept(dept_id)" +
				  ")"
				);

		  System.out.println("Employee table created");
	
		  st.executeUpdate("insert into Dept values(101,'CSE')");
		  st.executeUpdate("insert into Dept values(102,'ECE')");
		  st.executeUpdate("insert into Dept values(103,'EEE')");
		  System.out.println("Records has been inserted successfully into dept table");
		  
		 st.executeUpdate("insert into Emp values(4591,'Amar',200000,101)");
		 st.executeUpdate("insert into Emp values(4592,'Aman',200,102)");
		 st.executeUpdate("insert into Emp values(4593,'Virat',50000,103)");
		 System.out.println("A record has been inserted successfully into Employee table");
		
		 //updating a record in the employee table
		  st.executeUpdate("update emp set emp_name='sigma1/2' where emp_id=4592");
		  
		  
		  
	}

}
