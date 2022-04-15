package net.revature.services;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectionFactory {

	private static ConnectionFactory connectionFactory = null;
	private static Properties properties;
	 private ConnectionFactory() {
	        InputStream stream = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbConfig");
	        try {
	            properties = new Properties();
	            properties.load(stream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	// return our connection to the database:
	public static ConnectionFactory getConnectionFactory() {
		// if not connection yet:
		// register the driver
		
		if (connectionFactory == null) connectionFactory = new ConnectionFactory(); 
		return connectionFactory; 
		}
	public connection getConnection() {
		connection connection = null;
			// set up credentials (username, password)
			// pull these from the db config file
			String url = properties.getProperty("url");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");

		// try to connect to the database
		try {
			// get connection
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) { 
			// if something goes wrong, view the stack trace
			e.printStackTrace();
		}
		return connection;
	}
}

