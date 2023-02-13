<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
        String name = request.getParameter("name");
		String Location= request.getParameter("Location");
		out.print("<h1>hello is jsp</h1>");
		out.print(name);
		out.print(Location);

%>

</body>
</html>