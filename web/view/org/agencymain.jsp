<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String basePath = request.getContextPath();
%>
<title>org main</title>
</head>
<frameset rows="25%,75%">
	<frame src="<%=basePath%>/view/org/agencyhead.jsp" ></frame>
	<frame src="<%=basePath%>/view/org/agencycontent.jsp" ></frame>
</frameset>
<body>
</body>
</html>