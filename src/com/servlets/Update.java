package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDB;
import com.dao.UserDB;
import com.model.Employee;
import com.model.User;

@WebServlet("/Update")
public class Update extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		String username = request.getParameter("username");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String accountNumber = request.getParameter("bankAccountNumber");
		String phone = request.getParameter("mobileNo");
		String address = request.getParameter("address");
		
		Employee u = new Employee();
		u.setId(id);
		u.setName(username);
		u.setGrade(grade);
		u.setBankAccountNumber(accountNumber);
		u.setMobileNo(phone);
		u.setAddress(address);
		 
		int status = EmployeeDB.update(u);
		if(status>0) {
			response.sendRedirect("View");
		}else {
			out.println("Sorry! Unable to update record");
		}
		
	}
	
}