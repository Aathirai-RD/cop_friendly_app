package com.example.loginservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet{
	
	protected  void doGet(HttpServletRequest req , HttpServletResponse res) {
		
		try {
		
		System.out.println("inside doget...");
		String name = req.getParameter("uname");
		String password = req.getParameter("upass");
		String admin = "admin";
		
		System.out.println(name +" - "+password);
		if(name.contains(admin) && password.contains(admin))
		{
			System.out.println("successful...");
			res.sendRedirect("main.html");
		}
		else
		{
			System.out.println("unsuccessful...");
			res.sendRedirect("index.html");
	        out.println("Either user name or password is wrong");

			
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
