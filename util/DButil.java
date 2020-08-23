 package com.vastika.gp.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


	public class DButil {

		public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String URl = "jdbc:mysql://localhost:3306/gp_1";
		public static final String USER_NAME = "root";
		public static final String PASSWORD = "root";
		

		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			Class.forName(DRIVER_NAME);
			return DriverManager.getConnection(URl, USER_NAME, PASSWORD);
		
		
	}
}


