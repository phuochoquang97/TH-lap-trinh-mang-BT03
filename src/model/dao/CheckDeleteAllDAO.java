package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;

public class CheckDeleteAllDAO {
	public boolean isDeleteAll() {
		boolean t = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "delete from nhanvien" ;
			int rs = stmt.executeUpdate(sql);
			Statement stmt1 = connection.createStatement();
			String sql1 = "delete from phongban" ;

			int rs1 = stmt1.executeUpdate(sql1);
	        t = true;
	        return t;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
}
