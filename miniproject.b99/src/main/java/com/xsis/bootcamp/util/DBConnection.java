package com.xsis.bootcamp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private String url;
	private String username;
	private String password;
	private String driver;
	private Connection connection = null;

	public DBConnection() {
		this.url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		this.username = "hr";
		this.password = "hr";
		this.driver = "oracle.jdbc.driver.OracleDriver";
	}

	public void connect() {
		try {
			Class.forName(driver);

			this.connection = DriverManager.getConnection(url, username,
					password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Connection getConnection (){
		try {
			if (this.connection == null) connect();
			else if (this.connection.isClosed()) connect();
			return this.connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void closeConnection (){
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection db = new DBConnection();
		System.out.println(db.getConnection());

	}

}
