package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/sharath")
public class Servlets extends HttpServlet {
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException ,IOException{
		
		res.setContentType("text/html");
		
		PrintWriter writer = res.getWriter();
		
		writer.print("<html><body>");
		writer.print("welcome sharath");
		writer.print("</body></html>");
		
		
	}

}
