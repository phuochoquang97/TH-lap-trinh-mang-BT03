package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.CheckDeletePBDAO;

public class CheckDeletePBBO {
	CheckDeletePBDAO checkDeletePBDAO = new CheckDeletePBDAO();

	public boolean isDeletePB(String mapb) {
		return checkDeletePBDAO.isDeletePB(mapb);
	}
	public ArrayList<phongban> getPBList(String mapb) {
		return checkDeletePBDAO.getPBList(mapb);
	}
}
