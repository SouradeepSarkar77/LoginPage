package com.DB;

import java.sql.*;

public class DBConnect{
	public static Connection conn;
	public static Connection getConnection() {
		try {
			if(conn==null) {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginPage","root","root");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}