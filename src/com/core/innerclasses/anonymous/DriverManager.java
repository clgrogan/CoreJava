package com.core.innerclasses.anonymous;

public class DriverManager {
	public static void main(String[] args) {
		Connection connection = getConnection();
		connection.createStatement();
	}
	
	static Connection getConnection() {
		Connection connection = new Connection() {
			@Override
			public void createStatement() {	
				System.out.println("Inside anon class createStatement() method. ");
			}
		};
		return connection;
	}

}
