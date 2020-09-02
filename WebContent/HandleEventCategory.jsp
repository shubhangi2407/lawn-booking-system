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
 String nm=request.getParameter("eventcatname");
String lo=request.getParameter("logo");
EventCategory ec=new EventCategory(nm,lo);
EventCategoryDAO ecdao=new EventCategoryDAO();
String res=ecdao.addEventCategory(ec);
out.println(res);  

%>
</body>
</html>