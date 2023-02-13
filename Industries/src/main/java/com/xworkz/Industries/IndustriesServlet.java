package com.xworkz.Industries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/industry")
public class IndustriesServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
		 
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("hello");
		writer.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>JSP</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <form action=\"Industries.jsp\" method=\"post\">\r\n"
				+ "            <h1>Industries details</h1>\r\n"
				+ "            <div><label>name</label>\r\n"
				+ "                <input type=\"text\" name=\"name\" placeholder=\"NAME\">\r\n"
				+ "                <label>Location</label>\r\n"
				+ "            <input type=\"text\" name=\"Location\" placeholder=\"Location\">\r\n"
				+ "        <button type=\"submit\">submit</button>\r\n"
				+ "        </div>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}
	
	public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
//		String name = request.getParameter("name");
//		String Location= request.getParameter("Location");
//		writer.print(name);
//		writer.print(Location);
//		
		
		
	}
	
}
