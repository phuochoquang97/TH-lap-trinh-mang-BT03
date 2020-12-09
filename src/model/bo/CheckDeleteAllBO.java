package model.bo;

import model.dao.CheckDeleteAllDAO;
import model.dao.CheckDeleteAllDAO;

public class CheckDeleteAllBO {
	CheckDeleteAllDAO checkDeleteAllDAO = new CheckDeleteAllDAO();

	public boolean isDeleteAll() {
		return checkDeleteAllDAO.isDeleteAll();
	}
	
}
