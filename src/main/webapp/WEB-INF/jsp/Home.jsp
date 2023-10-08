<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PropertyTax</title>
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
			margin-right: 200px;margin-top:10px;margin-bottom:10px;">	<div style="margin-top: 70px;" align="center">
		<h2>Property Tax Application</h2>
	</div>
	<h2><a href="/propertytax/taxcalculate">Self Assessment form</a></h2><br/>
	<h2><a href="/propertytax/report">Zonal wise report</a></h2>
	<h4 style="color: green;"><c:if test="${not empty msg}">
		<c:out value="${msg}"></c:out>
	</c:if></h4>
</div>
</body>
</html>