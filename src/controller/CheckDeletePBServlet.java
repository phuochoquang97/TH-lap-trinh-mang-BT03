package controller;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.phongban;
import model.bo.CheckDeletePBBO;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckDeletePBServlet")
public class CheckDeletePBServlet extends HttpServlet {
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
		CheckDeletePBBO checkDeletePBBO = new CheckDeletePBBO();
		ArrayList<phongban> pblist = null;
		if (checkDeletePBBO.isDeletePB(mapb)) {
			pblist = checkDeletePBBO.getPBList(mapb);
			request.setAttribute("pblist", pblist);
			destination = "/xoaphongban.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		} else {
			destination = "/";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}
}
