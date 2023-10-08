<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Report</title>
<style type="text/css">
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body bgcolor="#CCCCFF">
	<div align="center" style="margin-left: 200px; height:600px;
			margin-right: 200px;margin-top:10px;margin-bottom:10px;">
		<table>
			<tr>
				<td><div><h2>Zonal wise collection of property tax</h2></div></td>
			</tr>
		</table>
		<table id="customers">
			<tr>
				<th>Zone Name</th>
				<th>Property type</th>
				<th>Amount Collected</th>
			</tr>
			<c:forEach items="${report}" var="report">
			<tr>
				<c:choose>
					<c:when test="${report.zoneName ne zone}">
						<td>${report.zoneName}</td>
					</c:when>
					<c:otherwise>
						<td></td>
					</c:otherwise>
				</c:choose>
				<td>${report.propertyType}</td>
				<td>${report.amountCollected}</td>
			</tr>
			<c:set var="zone"  value="${report.zoneName}" />
			</c:forEach>
		</table>
	</div>
</body>
</html>