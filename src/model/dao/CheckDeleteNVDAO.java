package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;

public class CheckDeleteNVDAO {
	public boolean isDeleteNV(String manv) {
		boolean t = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "delete from nhanvien where manv = '" + manv +"'" ;

			int rs = stmt.executeUpdate(sql);
	        t = true;
	        return t;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
	public ArrayList<nhanvien> getNVList(String search) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "select * from nhanvien";

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				nhanvien nv = new nhanvien();
				nv.setMaNV(rs.getString(1));
				nv.setHoten(rs.getString(2));
				nv.setGioitinh(rs.getString(3));
				nv.setPhongban(rs.getString(4));
				result.add(nv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}


}
