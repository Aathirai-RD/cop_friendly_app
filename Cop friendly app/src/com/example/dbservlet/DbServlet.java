package com.example.dbservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dbconnection.Connection;


@WebServlet("/dbservlet")
public class DbServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String name = req.getParameter("fname");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String vehicle = req.getParameter("vehicle");
		String date = req.getParameter("date");
		String offence = req.getParameter("offences");
		String Fineamount = req.getParameter("fineamount");
		Connection c = new Connection();
		c.print(name, phone, gender , address , vehicle , date , offence , fineamount);
		//System.out.println("calling addToDb class..!");
		//System.out.println("calling Db class..!");
		c.addToDb(name, phone, gender , address , vehicle , date , offence, fineamount);
		
		res.sendRedirect("main.html");
		
		
		

	}
	

}
