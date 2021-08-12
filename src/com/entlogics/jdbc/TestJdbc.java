package com.entlogics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String username = "root";
		String password = "Mysql@1999";

		try {

			System.out.println("Connecting database...");

			Connection mycon = DriverManager.getConnection(url, username, password);

			System.out.println("Connection succesfully Done...");

			mycon.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
