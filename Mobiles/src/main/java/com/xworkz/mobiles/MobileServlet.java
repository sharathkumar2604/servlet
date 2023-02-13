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

@WebServlet(value = "/save")
public class MobileServlet<HospitalDto> extends HttpServlet {
	MobileService service = new MobileServiceImpl();

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.print("<html>\r\n" + "\r\n" + "<head>\r\n" + "    <title></title>\r\n" + "    <style>\r\n"
				+ "        input {\r\n" + "\r\n" + "            padding: 10px;\r\n" + "            margin: 10px;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
				+ "    <div style=\"text-align: center;\">\r\n" + "        <form action=\"save\" method=\"post\">\r\n"
				+ "            <h1>mobile details</h1>\r\n"
				+ "            <div><input type=\"text\" name=\"name\" placeholder=\"NAME\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"RAM\" placeholder=\"RAM\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"color\" placeholder=\"color\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"price\" placeholder=\"price\"></div>\r\n"
				+ "            <button type=\"submit\">submit</button>\r\n" + "        </form>\r\n" + "\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>");

		req.getRequestDispatcher("/read").include(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		String name = req.getParameter("name");
		String RAM = req.getParameter("RAM");
		String color = req.getParameter("color");
		String price = req.getParameter("price");

		MobileDto dto1 = new MobileDto(name, RAM, color, price);

		String output = service.save(dto1);

		writer.print(output);
		writer.print(output);
		List<MobileDto> readAll = service.readAll();
		System.out.println(readAll);

	}
}
