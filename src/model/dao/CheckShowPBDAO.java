package model.dao;

import java.sql.*;
import java.util.*;

import model.bean.phongban;


public class CheckShowPBDAO {
	public ArrayList<phongban> getPBList() {
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
			System.out.println("Connect to database unsuccessfully!");
		}

		return result;
	}

}
