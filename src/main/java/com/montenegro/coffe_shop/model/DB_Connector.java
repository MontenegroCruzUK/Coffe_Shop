package com.montenegro.coffe_shop.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {
	
	public static Connection getConnection () {
		Connection connection = null;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			System.out.println ("Connecting to the database...");
			connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_cafeshop", "root", "");
			System.out.println ("Successful connection to the database.");
		} catch (SQLException | ClassNotFoundException se) {
			System.out.println ("No se puede conectar");
			System.out.println (se.toString ());
		}
		return connection;
	}
	public static void closeConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
				System.out.println("Connection closed successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Error while closing the connection: " + e.getMessage());
		}
	}
}

