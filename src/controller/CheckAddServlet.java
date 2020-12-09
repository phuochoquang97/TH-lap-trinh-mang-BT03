package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.phongban;
import model.bean.nhanvien;
import model.bo.CheckAddBO;

@WebServlet("/CheckAddServlet")
public class CheckAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * @ See HttpServlet #doGet(HttpServletRequest request, HttpServletResponse
	 * response
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/*
	 * @ See HttpServlet #doPost(HttpServlet request, HttpServletResponse response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String destination = null;
		String select = request.getParameter("select");
		CheckAddBO checkAddBO = new CheckAddBO();
		ArrayList<nhanvien> nvlist = null;
		ArrayList<phongban> pblist = null;
		if (select.equals("nv")) {
			String manv = request.getParameter("manv");
			String hoten = request.getParameter("hoten");
			String gioitinh = request.getParameter("gioitinh");
			String phongban = request.getParameter("phongban");
			if (checkAddBO.isAddSV(manv, hoten, gioitinh, phongban)) {
				nvlist = checkAddBO.getNVList();
				request.setAttribute("nvlist", nvlist);
				destination = "/xemnhanvien.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			} else {
				destination = "/xemnhanvien.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		if (select.equals("pb")) {
			String mapb = request.getParameter("mapb");
			String tenpb = request.getParameter("tenpb");
			if (checkAddBO.isAddPB(mapb, tenpb)) {
				pblist = checkAddBO.getPBList();
				request.setAttribute("pblist", pblist);
				destination = "/xemphongban.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			} else {
				destination = "/xemphongban.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
	}
}
