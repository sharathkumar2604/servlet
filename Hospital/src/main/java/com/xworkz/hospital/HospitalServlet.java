package com.xworkz.hospital;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;
@WebServlet(value="/save")
public class HospitalServlet extends HttpServlet{
 
	HospitalService service = new HospitalServiceImpl();
	public void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
	
		res.setContentType("text/html");
	PrintWriter writer = res.getWriter();
	writer.print("<html>\r\n"
			+ "\r\n"
			+ "<head>\r\n"
			+ "    <title></title>\r\n"
			+ "    <style>\r\n"
			+ "        input {\r\n"
			+ "\r\n"
			+ "            padding: 10px;\r\n"
			+ "            margin: 10px;\r\n"
			+ "        }\r\n"
			+ "    </style>\r\n"
			+ "\r\n"
			+ "</head>\r\n"
			+ "\r\n"
			+ "<body>\r\n"
			+ "    <div style=\"text-align: center;\">\r\n"
			+ "        <form action=\"save\" method=\"post\">\r\n"
			+ "            <h1>hospital details</h1>\r\n"
			+ "            <div><input type=\"text\" name=\"name\" placeholder=\"NAME\"></div>\r\n"
			+" <div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>\r\n"
			+ "            <div><input type=\"text\" name=\"noOfWards\" placeholder=\"NoOfWards\"></div>\r\n"
			+ "            <div><input type=\"text\" name=\"noOfNurse\" placeholder=\"NoOfNurse\"></div>\r\n"
			+ "            <div><input type=\"text\" name=\"noOfDoctors\" placeholder=\"NoOdDoctors\"></div>\r\n"
			+ "            <button type=\"submit\" style=\"\">submit</button>\r\n"
			+ "        </form>\r\n"
			+ "\r\n"
			+ "</body>\r\n"
			+ "\r\n"
			+ "</html>");
	
	}
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		String name=req.getParameter("name");
		String location=req.getParameter("location");
		String noOfWards=req.getParameter("noOfWards");
		String noOfNurse=req.getParameter("noOfNurse");
		String noOfDoctors=req.getParameter("noOfDoctors");
		
		HospitalDto dto1 = new HospitalDto(name, location, noOfWards, noOfNurse, noOfDoctors);
		
		res.setContentType("text/html");
		String output = service.save(dto1);
		PrintWriter writer = res.getWriter();
		writer.print(output);
		
	}
	
}