package com.project.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;

public class Dbconnect {
	
	private static String DBDriver = "org.h2.Driver";
	private static String DBURL = "jdbc:h2:tcp://localhost/~/Classmates";
	private static String DBUsername = "pari_kumar";
	private static String DBPassword = "vicky@31";
	
	protected static Connection con = null;
	
	private static Server server = null;

	protected static void connnection() throws SQLException, ClassNotFoundException {

		server = Server.createTcpServer().start();
		Class.forName(DBDriver);
		con = DriverManager.getConnection(DBURL, DBUsername, DBPassword);

	}

	protected void closeall() throws SQLException {
		con.close();
		server.stop();

	}
}
