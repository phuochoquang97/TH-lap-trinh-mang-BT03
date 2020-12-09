package model.bo;

import java.util.*;

import model.bean.nhanvien;
import model.bean.phongban;
import model.dao.CheckUpdateNVDAO;

public class CheckUpdateNVBO {
	CheckUpdateNVDAO checkUpdateNVDAO = new CheckUpdateNVDAO();

	public boolean isUpdateNV(String manv, String hoten, String gioitinh, String phongban) {
		return checkUpdateNVDAO.isUpdateNV(manv, hoten, gioitinh, phongban);
	}
	public ArrayList<nhanvien> getNVList() {
		return checkUpdateNVDAO.getNVList();
	}
	public boolean isUpdatePB(String mapb, String tenpb) {
		return checkUpdateNVDAO.isUpdatePB(mapb, tenpb);
	}
	public ArrayList<phongban> getPBList() {
		return checkUpdateNVDAO.getPBList();
	}
}
