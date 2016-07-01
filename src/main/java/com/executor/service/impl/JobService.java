package com.executor.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.mortbay.log.Log;

import com.executor.service.IJobService;

public class JobService implements IJobService {

	public void getRows() throws ClassNotFoundException, SQLException {
		String jdbcdriver = "org.apache.hive.jdbc.HiveDriver";
		String jdbcurl = "jdbc:hive2://192.168.0.10:10000";
		String username = "ww";
		String password = "";
		System.out.println("222222");
		Class.forName(jdbcdriver);
		System.out.println("333333");

		try {
			Connection c = DriverManager.getConnection(jdbcurl, username, password);
			System.out.println("444444");
			Statement st = c.createStatement();
			System.out.println("555555");
			System.out.println("column: " + st.executeQuery("select * from src").getMetaData().getColumnName(1)
					+ "column: " + st.executeQuery("select * from src").getMetaData().getColumnName(2));
			// System.out.println( "data: "+st.executeQuery("select * from
			// src").getString(1)+ "data: "+st.executeQuery("select * from
			// src").getString(2));
		} catch (Exception e) {
			System.out.println("test error : " + e);
		}
	}

}
