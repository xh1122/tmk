<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String basePath = request.getContextPath();
	String msg = (String)request.getAttribute("msg");
%>
<title>org head</title>
</head>
<body >
<%if(msg!=null){ %>
<%=msg%>
<%} %>
<form id="form" action="agency" method="post" >
	<tr>
		<input type="submit" value="增加机构" />
	</tr>
	<tr>
		<td>
			机构名称<input type="text" name="orgName" id="orgName" />
		</td>
		<td>
			机构ID<input type="text" name="orgId" id="orgId" />
		</td>
	</tr>
</form>
</body>
</html>