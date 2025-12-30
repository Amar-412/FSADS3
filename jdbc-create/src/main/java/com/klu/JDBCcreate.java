package com.klu;
import java.sql.*;

public class JDBCcreate {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/fsads3";
		String usr = "root";
		String pwd ="3945";
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,usr,pwd);
        System.out.println("Connection Established");
        String query = "create table if not exists Student("+ "id int primary key auto_increment,"+" name varchar(20)"+")";
        String query1 ="insert into Student values("+"'2400031412', 'Amar'"+")";
        Statement st = con.createStatement();
        st.execute(query);
        //st.execute(query1);
        con.close();
               
	}

}
