package model.bo;

import java.util.*;
import model.dao.CheckShowNVDAO;
import model.bean.nhanvien;

public class CheckShowNVBO {
	CheckShowNVDAO checkShowNVDAO = new CheckShowNVDAO();

	public ArrayList<nhanvien> getNVList() {
		return checkShowNVDAO.getNVList();
	}

}
