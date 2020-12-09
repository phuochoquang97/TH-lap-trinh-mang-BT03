package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;

public class CheckUpdateNVDAO {
	public boolean isUpdateNV(String manv, String hoten, String gioitinh, String phongban) {
		boolean t = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "update nhanvien set hoten = '" + hoten + "', gioitinh = '" + gioitinh +"', phongban = '" + phongban + "' where manv = '" + manv + "'";

			int rs = stmt.executeUpdate(sql);
			t = true;
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
	public boolean isUpdatePB(String mapb, String tenpb) {
		boolean t = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nv";
			Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

			System.out.println("Connect to database successfully!");
			Statement stmt = connection.createStatement();
			String sql = "update phongban set tenpb = '" + tenpb + "' where mapb = '" + mapb + "'";

			int rs = stmt.executeUpdate(sql);
			t = true;
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
