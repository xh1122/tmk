<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String basePath = request.getContextPath();
%>
<title>org head</title>
</head>
<body>
<form id="form" action="addorg" method="post" >
	<tr>
		<input type="submit" value="���ӻ���" />
	</tr>
	<tr>
		<td>
			��������<input type="text" name="orgName" id="orgName" />
		</td>
		<td>
			����ID<input type="text" name="orgId" id="orgId" />
		</td>
	</tr>
</form>
</body>
</html>