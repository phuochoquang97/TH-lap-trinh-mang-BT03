package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.CheckDeleteNVDAO;

public class CheckDeleteNVBO {
	CheckDeleteNVDAO checkDeleteNVDAO = new CheckDeleteNVDAO();

	public boolean isDeleteNV(String manv) {
		return checkDeleteNVDAO.isDeleteNV(manv);
	}
	public ArrayList<nhanvien> getNVList(String manv) {
		return checkDeleteNVDAO.getNVList(manv);
	}
}
