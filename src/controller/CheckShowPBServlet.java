package controller;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.CheckShowPBBO;
import model.bean.phongban;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckShowPBServlet")
public class CheckShowPBServlet extends HttpServlet {
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
		String mapb = request.getParameter("mapb");
		CheckShowPBBO checkShowPBBO = new CheckShowPBBO();
		ArrayList<phongban> pblist = null;
		pblist = checkShowPBBO.getPBList();
		request.setAttribute("pblist", pblist);
		if (mapb.equals("xem")) {
			destination = "/xemphongban.jsp";
		}
		else if (mapb.equals("xoa")) {
			destination = "/xoaphongban.jsp";
		}
		else {
			destination = "/capnhatphongban.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}
}
