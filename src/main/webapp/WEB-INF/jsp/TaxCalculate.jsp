<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
http://localhost:8082/propertytax/taxcalculate/1/Owner?assessmentYear=2014&constructedYear=2003&area=1200&description=1
function taxcalculate(){
	var zoneId = document.getElementById('zonalClassification').value;
	var status = document.getElementById('status').value;
	var assessmentYear = document.getElementById('assessmentYear').value;
	var constructedYear = document.getElementById('constructedYear').value;
	var area = document.getElementById('propertyArea').value;
	var propertyDescription = document.getElementById("propertyDescription").value;
	if (zoneId != "" && status != "" && assessmentYear != "" 
			&& constructedYear != "" && area != "" && propertyDescription != "") {
    	$.ajax({
       		type: "GET",
        	url: "/propertytax/taxcalculate/"+zoneId+"/"+status+"?assessmentYear="
        			+assessmentYear+"&constructedYear="+constructedYear+"&area="+area+"&description="+propertyDescription,
        	success: function(data){
        		document.getElementById('tax').value = data;
        	},
        	error: function (data){
            	alert("sorry payment failed");
        	}
    	});
	}
}
function validateForm() {
	var assessmentYear = document.getElementById("assessmentYear").value;
	if (assessmentYear == "") {
		alert("Year of Assessment can not null or empty");
		document.getElementById("assessmentYear").focus();
		return false;
	}
	if (assessmentYear > 2023) {
		alert("Year of Assessment can not be future year");
		document.getElementById("assessmentYear").focus();
		return false;
	}
	var ownerName = document.getElementById("ownerName").value;
	if (ownerName == "") {
		alert("Name of the owner can not null or empty");
		document.getElementById("ownerName").focus();
		return false;
	}
	var email = document.getElementById("email").value;
	if (email == "") {
		alert("Email can not null or empty");
		document.getElementById("email").focus();
		return false;
	}
	var propertyAddress = document.getElementById("propertyAddress").value;
	if (propertyAddress == "") {
		alert("Address of property can not null or empty");
		document.getElementById("propertyAddress").focus();
		return false;
	}
	var zonalClassification = document.getElementById("zonalClassification").value;
	if (zonalClassification == "") {
		alert("Zonal Classification can not null or empty");
		document.getElementById("zonalClassification").focus();
		return false;
	}
	var propertyDescription = document.getElementById("propertyDescription").value;
	if (propertyDescription == "") {
		alert("Description of property can not null or empty");
		document.getElementById("propertyDescription").focus();
		return false;
	}
	var status = document.getElementById("status").value;
	if (status == "") {
		alert("Status can not null or empty");
		document.getElementById("status").focus();
		return false;
	}
	var constructedYear = document.getElementById("constructedYear").value;
	if (constructedYear == "") {
		alert("Constructed Year can not null or empty");
		document.getElementById("constructedYear").focus();
		return false;
	}
	if (constructedYear > 2023) {
		alert("Constructed year can not be future year");
		document.getElementById("constructedYear").focus();
		return false;
	}
	var propertyArea = document.getElementById("propertyArea").value;
	if (propertyArea == "") {
		alert("Area can not null or empty");
		document.getElementById("propertyArea").focus();
		return false;
	}
	var tax = document.getElementById("tax").value;
	if (tax == "") {
		alert("Tax can not null or empty");
		document.getElementById("tax").focus();
		return false;
	}
	document.form.submit();
}

</script>
<script src="rest.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
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
  padding: 7px 10px;
  margin: 2px 5px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=button] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 7px 10px;
  margin: 2px 5px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
</head>
<body bgcolor="#CCCCFF">
<div align="center" style="margin-left: 150px; margin-right: 150px;margin-bottom:10px;">
<form:form id="form" action="/propertytax/taxcalculate" method="POST" modelAttribute="propertyTax">
<h3 align="center">Self Assessment of Property Tax Form</h3>

	<table align="center">
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>Year of Assessment:</td>
			<td><form:input path="assessmentYear" 
				id="assessmentYear" onchange="taxcalculate()" maxlength="4"/></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Name of the Owner: </td>
			<td><form:input path="ownerName" id="ownerName"/></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Email:</td>
			<td><form:input path="email" id="email"/></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Address of Property:</td>
			<td><form:textarea path="propertyAddress" id="propertyAddress" rows="4" cols="25"/></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Zonal Classification: </td>
			<td><form:select path="zonalClassification" id="zonalClassification" style="width:140px;" onchange="taxcalculate()">
				<form:option value="">Select</form:option>
				<c:forEach items="${zone}" var="zone">
					<form:option value="${zone.id}">${zone.zone}</form:option>
				</c:forEach>
			</form:select>
			</td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Description of property: </td>
			<td><form:select path="propertyDescription" id="propertyDescription" style="width:180px;" onchange="taxcalculate()">
				<form:option value="">Select</form:option>
				<c:forEach items="${propertyDescription}" var="description">
					<form:option value="${description.id}">${description.descriptionName}</form:option>
				</c:forEach>
			</form:select>
			</td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Status: </td>
			<td><form:select path="status" id="status" style="width:140px;" onchange="taxcalculate()">
				<form:option value="">Select</form:option>
				<form:option value="Owner">Owner</form:option>
				<form:option value="Tenanted">Tenanted</form:option>
			</form:select>
			</td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Building constructed year:</td>
			<td><form:input path="constructedYear" 
				id="constructedYear" onchange="taxcalculate()" maxlength="4"/></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Built up area(Square feet):</td>
			<td><form:input path="propertyArea" id="propertyArea" onchange="taxcalculate()" /></td>
		</tr>
		<tr><td><td>&nbsp;<td></td></tr>
		<tr>
			<td>Total Tax Payable:</td>
			<td><form:input path="tax" id="tax" /></td>
		</tr>
		<tr>
			<td align="right" >&nbsp;&nbsp;<br/><a href="/propertytax/home"><input type="button" id="cancel" value="Cancel" style="width:80px;"/></a></td>
			<td>&nbsp;&nbsp;<br/><input type="submit" onclick="return validateForm();" value="Pay Tax"></td>
		</tr>
</table>
</form:form>
</div>
</body>

</html>