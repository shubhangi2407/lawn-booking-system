<%@page import="com.dao.DecorationsDAO"%>
<%@page import="com.entity.Decorations"%>
<%@page import="com.dao.EventCategoryDAO"%>
<%@page import="com.entity.EventCategory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String ty=request.getParameter("decorationtype");
Decorations d=new Decorations(ty);
DecorationsDAO ddao=new DecorationsDAO();
String res=ddao.addDecorations(d);
out.println(res);  

%>
</body>
</html>