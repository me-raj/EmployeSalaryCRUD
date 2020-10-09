package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDB;
import com.dao.UserDB;
import com.model.Employee;
import com.model.User;


@WebServlet("/Delete")
public class Delete  extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		Employee u = new Employee();
		u.setId(id);
		EmployeeDB.delete(u);
		response.sendRedirect("View");
	}
}