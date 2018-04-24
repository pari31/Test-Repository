package com.project.Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.config.Dbconnect;

public class DBStatment extends Dbconnect {
	
	private static Statement stmt=null;
	private static int Student_id;
	private static String name;
	private static String course;
	private static long phone_no;
	private static String email_id;
	private static BufferedReader br=null;
	public DBStatment() throws SQLException, ClassNotFoundException{
		connnection();
		stmt=con.createStatement();
	}
	public static String insert() throws NumberFormatException, IOException, SQLException {
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Student ID:-");
		Student_id=Integer.parseInt(br.readLine());
		System.out.print("Enter Student Name:-");
		name=br.readLine();
		System.out.print("Enter Student Course:-");
		course=br.readLine();
		System.out.print("Enter Student Phone Number:-");
		phone_no=Long.parseLong(br.readLine());
		System.out.print("Enter Student Email ID:-");
		email_id=br.readLine();
		
		int check=stmt.executeUpdate("insert into CLASSMATES values("+Student_id+",'"+name+"','"+course+"',"+phone_no+",'"+email_id+"')");
		
		if(check>0) {
			return "Record inserted Successfull";
		}
		else {
			return "Record not inserted";
		}
		
	}

}
