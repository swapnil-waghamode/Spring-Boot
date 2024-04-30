package com.jdb;

import java.sql.*;

public class SelectOperation {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String user = "system";
		String pass = "system";

		Connection conn = null;

		Statement st = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);

			st = conn.createStatement();

			String sql = "SELECT * FROM empl";

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if(st !=null)
					st.close();
				
				if(conn !=null)
					conn.close();
	
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

}
