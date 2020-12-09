package controller;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nhanvien;
import model.bo.CheckDeleteNVBO;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckDeleteNVServlet")
public class CheckDeleteNVServlet extends HttpServlet {
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
		response.setCharacterEncoding("utf-8");
		String destination = null;
		String manv = request.getParameter("manv");
		CheckDeleteNVBO checkDeleteNVBO = new CheckDeleteNVBO();
		ArrayList<nhanvien> nvlist = null;
		if (checkDeleteNVBO.isDeleteNV(manv)) {
			nvlist = checkDeleteNVBO.getNVList(manv);
			request.setAttribute("nvlist", nvlist);
			destination = "/xoanhanvien.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		} else {
			destination = "/";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
