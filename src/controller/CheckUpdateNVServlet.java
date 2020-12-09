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
import model.bo.CheckUpdateNVBO;

/*
 * Servlet implementation class CheckLoginServlet
 */

@WebServlet("/CheckUpdateNVServlet")
public class CheckUpdateNVServlet extends HttpServlet {
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
		String name = request.getParameter("name");
		CheckUpdateNVBO checkUpdateNVBO = new CheckUpdateNVBO();
		ArrayList<nhanvien> nvlist = null;
		ArrayList<phongban> pblist = null;
		if (name.equals("nv")) {
			String manv = request.getParameter("manv");
			String hoten = request.getParameter("hoten");
			String gioitinh = request.getParameter("gioitinh");
			String phongban = request.getParameter("phongban");
			if (checkUpdateNVBO.isUpdateNV(manv, hoten, gioitinh, phongban)) {
				nvlist = checkUpdateNVBO.getNVList();
				request.setAttribute("nvlist", nvlist);
				destination = "/capnhatnhanvien.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
		else {
			String mapb = request.getParameter("mapb");
			String tenpb = request.getParameter("tenpb");
			if (checkUpdateNVBO.isUpdatePB(mapb, tenpb)) {
				pblist = checkUpdateNVBO.getPBList();
				request.setAttribute("pblist", pblist);
				destination = "/capnhatphongban.jsp";
				RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				rd.forward(request, response);
			}
		}
	}
}
