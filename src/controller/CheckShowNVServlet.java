package controller;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.CheckShowNVBO;
import model.bean.nhanvien;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckShowNVServlet")
public class CheckShowNVServlet extends HttpServlet {
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
		System.out.println(manv);
		CheckShowNVBO checkShowNVBO = new CheckShowNVBO();
		ArrayList<nhanvien> nvlist = null;
		nvlist = checkShowNVBO.getNVList();
		request.setAttribute("nvlist", nvlist);
		if (manv.equals("xem")) {
			destination = "/xemnhanvien.jsp";
		}
		else if (manv.equals("xoa")) {
			destination = "/xoanhanvien.jsp";
		}
		else {
			destination = "/capnhatnhanvien.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}
}
