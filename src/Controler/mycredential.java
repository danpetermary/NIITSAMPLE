package Controler;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import TestTransact.*;
import myutility.MyDriver;
import java.io.*;

/**
 * Servlet implementation class mycredential
 */
@WebServlet("/mycredential")
public class mycredential extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mycredential() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int userid=Integer.parseInt(request.getParameter("txtid"));
		String pwd=request.getParameter("txtpwd");
		PrintWriter pw=response.getWriter();
		
		RequestDispatcher rd;
		
		
		try
		{
		MyDriver d=new MyDriver();
		 findTest tranObj=new findTest();	 
		Connection con=d.getmyConnect();
		boolean ans=tranObj.validateuser(userid, pwd);
		if(ans)
			pw.println("success");
		else
		{
			
			 rd=request.getRequestDispatcher("home.jsp");
			 request.setAttribute("pwd","Your Password is not correct");
			 rd.forward(request, response);
		}	
		}
		catch(Exception e)
		{
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
