package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectQueryExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");

			PreparedStatement pt = conn.prepareStatement("insert into employee(empno,name,address,salary)values(?,?,?,?)");
			pt.setInt(1, 107);
			pt.setString(2, "ram");
			pt.setString(3, "bangalore");
			pt.setDouble(4, 81000);

			int count = pt.executeUpdate();
		System.out.println("row updated "+count);

		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}
}
