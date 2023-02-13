package com.xworkz.dish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/form")

public class Telivision extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();

		writer.print("<html><body>");
		writer.print("<form action ='form' method='post'>");
		writer.println("Name :<input type ='text' name ='name'>");
		writer.println("Email :<input type = 'text' name ='email'>");
		writer.print("<button type='submit' name ='submit'>submit</button></form>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.print("<h1>submited</h1>");
		writer.print("name:" + name);
		writer.print("email:" + email);
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
	}

}


