package Controler;

import java.io.IOException;

import javax.security.auth.login.*;
import javax.servlet.RequestDispatcher;
//import javax.security.auth.login.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import MyEntity.*;
import myutility.*;
import TestTransact.*;
import java.sql.*;
import java.util.*;

/**
 * Servlet implementation class MyValidator
 */
@WebServlet("/MyValidator")

public class MyValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyValidator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
		int empid=Integer.parseInt(request.getParameter("empid"));
		String emp_name=request.getParameter("emp_name");
		String region=request.getParameter("region");
		String bunit=request.getParameter("bunit");
		 String work=request.getParameter("work");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String emailid=request.getParameter("emailid");
		int super_id=Integer.parseInt(request.getParameter("super_id"));
		String role=request.getParameter("role");
		String desig=request.getParameter("desig");
		String country=request.getParameter("country");
		 String dob=request.getParameter("dob");
		int exprnce=Integer.parseInt(request.getParameter("empid"));
		String pwd=request.getParameter("pwd");
			
			// pw.print("Welcome " + emp_name);
	 
	 MyDriver d=new MyDriver();
	 findTest tranObj=new findTest();	 
		   
	Connection con=d.getmyConnect();
	
	
	Map mk=tranObj.addData(empid, mobile, super_id, exprnce, emp_name, region, bunit, work, emailid, role, desig, country, pwd, dob);
	
	RequestDispatcher rd;

	if(mk.isEmpty())
	{
		
	rd=request.getRequestDispatcher("confirm.jsp");
	request.setAttribute("nm", emp_name);
	rd.forward(request, response);
	}
	else
	{
		rd=request.getRequestDispatcher("Welcome.jsp");
		request.setAttribute("errs",mk);
		rd.forward(request, response);
	}
	}
	catch(Exception ee)
	 	 { 
		pw.println(ee.toString());
	 	 } 
	//Configuration cf=new Configuration();
	 	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
