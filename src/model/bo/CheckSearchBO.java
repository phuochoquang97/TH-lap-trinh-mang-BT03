package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.bean.phongban;
import model.dao.CheckSearchDAO;

public class CheckSearchBO {
	CheckSearchDAO checkSearchDAO = new CheckSearchDAO();

	public ArrayList<nhanvien> SearchNV(String hoten) {
		return checkSearchDAO.SearchNV(hoten);
	}
	public ArrayList<phongban> SearchPB(String tenpb) {
		return checkSearchDAO.SearchPB(tenpb);
	}
}
