package model.dao;

import java.sql.*;
import java.util.*;

import model.bean.nhanvien;
import model.bean.phongban;

public class CheckAddDAO {
	boolean t = false;
	public boolean isAddNV(String manv, String hoten, String gioitinh, String phongban) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "INSERT INTO nhanvien VALUES ('"+manv+"','"+hoten+"','"+gioitinh+"','"+phongban+"')";
			t = true;
			int rs = stmt.executeUpdate(sql);
	    	return t;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
	public ArrayList<nhanvien> getNVList() {
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
				nhanvien sv = new nhanvien();
				sv.setMaNV(rs.getString(1));
				sv.setHoten(rs.getString(2));
				sv.setGioitinh(rs.getString(3));
				sv.setPhongban(rs.getString(4));
				result.add(sv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
	public boolean isAddPB(String mapb, String tenpb) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "INSERT INTO phongban VALUES ('"+mapb+"','"+tenpb+"')";
			t = true;
			int rs = stmt.executeUpdate(sql);
	    	return t;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
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
		}

		return result;
	}
}
