<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String basePath = request.getContextPath();
%>
<title>org main</title>
</head>
<frameset rows="10%,90%">
	<frame src="<%=basePath%>/view/org/orghead.jsp" ></frame>
	<frame src="<%=basePath%>/view/org/orgcontent.jsp" ></frame>
</frameset>
<body>
</body>
</html>