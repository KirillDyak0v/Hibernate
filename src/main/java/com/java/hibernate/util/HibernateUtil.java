package com.java.hibernate.util;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
public class HibernateUtil {
	public class App{

	    private final String url = "jdbc:postgresql://localhost/dvdrental";
	    private final String user = "postgres";
	    private final String password = "<add your password>";
	    public Connection connect() {
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the PostgreSQL server successfully.");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	    }
	}

}
