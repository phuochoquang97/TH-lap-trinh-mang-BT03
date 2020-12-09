package model.bo;

import java.util.*;
import model.dao.CheckShowPBDAO;
import model.bean.phongban;

public class CheckShowPBBO {
	CheckShowPBDAO checkShowPBDAO = new CheckShowPBDAO();

	public ArrayList<phongban> getPBList() {
		return checkShowPBDAO.getPBList();
	}

}
