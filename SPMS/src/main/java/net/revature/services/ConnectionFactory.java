package net.revature.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

	private static Connection connection = null;
	
	// return our connection to the database:
	public static Connection getConnection() {
		// if not connection yet:
		// register the driver
		
		if (connection == null) {
			// set up credentials (username, password)
			// pull these from the db config file
			ResourceBundle bundle = ResourceBundle.getBundle("dbConfig");
			String url = bundle.getString("url");
			String username = bundle.getString("username");
			String password = bundle.getString("password");
		}
		// try to connect to the database
		try {
			// get connection
			Class.forName("org.postgresssql.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) { 
			// if something goes wrong, view the stack trace
			e.printStackTrace();
		}
		return connection;
	}
}

