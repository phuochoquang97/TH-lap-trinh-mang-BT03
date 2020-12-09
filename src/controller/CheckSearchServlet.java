package controller;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nhanvien;
import model.bean.phongban;
import model.bo.CheckSearchBO;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckSearchServlet")
public class CheckSearchServlet extends HttpServlet {
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
		String destination = null;
		String name = request.getParameter("name");
		String textsearch = request.getParameter("textsearch");
		CheckSearchBO checkSearchBO = new CheckSearchBO();
		ArrayList<nhanvien> nvlist = null;
		ArrayList<phongban> pblist = null;
		if (name.equals("nv")) {
			nvlist = checkSearchBO.SearchNV(textsearch);
			request.setAttribute("nvlist", nvlist);
			destination = "/timkiemnhanvien.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
		else {
			pblist = checkSearchBO.SearchPB(textsearch);
			request.setAttribute("pblist", pblist);
			destination = "/timkiemphongban.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
