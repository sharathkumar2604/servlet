package com.xworkz.mobiles;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mobiles.dto.MobileDto;
import com.xworkz.mobiles.service.MobileService;
import com.xworkz.mobiles.service.MobileServiceImpl;
@WebServlet(value="/read")
public class MobileServlet1 extends HttpServlet {
	
	MobileService service = new MobileServiceImpl();
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("manoj");
	res.setContentType("text/html");
	PrintWriter writer = res.getWriter();
	List<MobileDto> list = service.readAll();
	writer.print("<table>");
	for (MobileDto dto : list)
	{
		writer.print("<tr><td>");
		writer.print(dto.getName());
		writer.print("</td>");
		
		writer.print("<td>");
		writer.print(dto.getRAM());
		writer.print("</td>");
	
		writer.print("<td>");
		writer.print(dto.getColor());
		writer.print("</td>");
		
		writer.print("<td>");
		writer.print(dto.getPrice());
		writer.print("</td></tr>");
		
		
	}
		
	writer.print("</table>");
	System.out.println("manoj123");
	}
	

}
