<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String msg = (String)request.getParameter("msg");
%>
<title>Insert title here</title>
</head>
<body>
<%=msg %>
</body>
</html>