package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.phongban;

public class CheckDeletePBDAO {
	public boolean isDeletePB(String mapb) {
		boolean t = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "delete from phongban where mapb = '" + mapb +"'" ;

			int rs = stmt.executeUpdate(sql);
	        t = true;
	        return t;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
	public ArrayList<phongban> getPBList(String search) {
		ArrayList<phongban> result = new ArrayList<phongban>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "select * from phongban";

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				phongban pb = new phongban();
				pb.setMaPB(rs.getString(1));
				pb.setTenPB(rs.getString(2));
				result.add(pb);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
}
