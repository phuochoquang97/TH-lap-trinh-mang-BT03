package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;

public class CheckSearchDAO {
	public ArrayList<nhanvien> SearchNV(String hoten) {
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "select * from nhanvien where hoten like '%"+hoten+"%'";

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				nhanvien nhanvien = new nhanvien();
				nhanvien.setMaNV(rs.getString(1));
				nhanvien.setHoten(rs.getString(2));
				nhanvien.setGioitinh(rs.getString(3));
				nhanvien.setPhongban(rs.getString(4));
				result.add(nhanvien);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
	public ArrayList<phongban> SearchPB(String tenpb) {
		ArrayList<phongban> result = new ArrayList<phongban>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "select * from phongban where tenpb like '%"+tenpb+"%'";

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				phongban phongban = new phongban();
				phongban.setMaPB(rs.getString(1));
				phongban.setTenPB(rs.getString(2));
				result.add(phongban);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
}
