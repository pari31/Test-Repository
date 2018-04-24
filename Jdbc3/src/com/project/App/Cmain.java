package com.project.App;

import java.io.IOException;
import java.sql.SQLException;

import com.project.Logic.DBStatment;

public class Cmain {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException, ClassNotFoundException {
		DBStatment ob=new DBStatment();
		System.out.println(DBStatment.insert());
	}

}
