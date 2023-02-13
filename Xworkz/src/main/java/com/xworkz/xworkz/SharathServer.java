package com.xworkz.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet(value = "/shara")
public class SharathServer extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		res.setContentType("text/html");
		
		PrintWriter writer = res.getWriter();
		writer.print("<html><body>");
		writer.print("<h1>Hello folk java creater</h1>");
		writer.print("</body></html>");
	}

}
