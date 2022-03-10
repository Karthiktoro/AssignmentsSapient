package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertStatement {

	public static void main(String[] args) {

		Connection conn = null;
		// load the driver
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			// get the connection
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");

			PreparedStatement pst = conn
					.prepareStatement("insert into employee(empno,name,address,salary) values(?,?,?,?)");
			pst.setInt(1, 106);
			pst.setString(2, "ravi");
			pst.setString(3, "bangalore");
			pst.setInt(4, 97000);

			int count = pst.executeUpdate();
			System.out.println("row inserted  " + count);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
