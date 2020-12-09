package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;
import model.dao.CheckAddDAO;

public class CheckAddBO {
	CheckAddDAO checkAddDAO = new CheckAddDAO();

	public boolean isAddSV(String manv, String hoten, String gioitinh, String phongban) {
		return checkAddDAO.isAddNV(manv, hoten, gioitinh, phongban);
	}
	public ArrayList<nhanvien> getNVList() {
		return checkAddDAO.getNVList();
	}
	public boolean isAddPB(String mapb, String tenpb) {
		return checkAddDAO.isAddPB(mapb, tenpb);
	}
	public ArrayList<phongban> getPBList() {
		return checkAddDAO.getPBList();
	}
}	
