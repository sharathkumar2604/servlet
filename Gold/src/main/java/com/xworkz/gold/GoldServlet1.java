package com.xworkz.gold;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
@WebServlet(value="/servlet1")
public class GoldServlet1 extends HttpServlet {

	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		//request.getRequestDispatcher("/servlet2").forward(request, response);
		PrintWriter  writer = response.getWriter();
		writer.print("nannu first servlet i am taking the response from servlet2");
		request.getRequestDispatcher("/servlet2").include(request, response);
		

		
		
		
		
		
	}




}
