<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
    <table cellpadding="0" cellspacing="0" border="0" align="center" width="100%" >
<tr>
<td style="width:100%; height: 50px;" colspan="2" valign="top">
<tiles:insertAttribute name="loginHeader" />
</td>
</tr>
<tr>
<td style="width:100%; height: 10px;" colspan="2" valign="top">
<tiles:insertAttribute name="loginMenu" />
</td>
</tr>
<tr>
<td style="width:100%; min-height: 420px;" valign="top">
<tiles:insertAttribute name="loginBody" />
</td>
</tr>
</table>
</body>
</html>