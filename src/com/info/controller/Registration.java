package com.info.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.EmployeeDAO;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/CreateEmployee.htm") //url pattern
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   int eid= Integer.parseInt(request.getParameter("eid"));
		String fname =request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		double sal= Double.parseDouble(request.getParameter("sal"));
		   int uid=Integer.parseInt(request.getParameter("uid"));
		String paswd=request.getParameter("paswd");
		
		EmployeeDAO edao =new EmployeeDAO();
		int result=edao.addEmployee(eid, fname, lname, gender, sal, uid, paswd);
		
		PrintWriter pw= response.getWriter();
		
		if(result > 0){
			pw.println(eid+"Employee created");
			
					}
		else
		{
			pw.println(eid+"Employee Not Created");
		}
	
		
		
		
	}

}
