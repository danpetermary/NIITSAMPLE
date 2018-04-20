<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.io.*, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="lightyellow">



<form action="MyValidator">

<h1> Employee Registration Form </h1>


enter id<input type="text" name="empid"> ${errs.empid} <br>
name <input type="text" name="emp_name"><br>
region <input type="text" name="region"><br>
business unit<input type="text" name="bunit"><br>
work location <input type="text" name="work"><br>
mobile number<input type="text" name="mobile"> ${errs.mobile} <br>
email id<input type="text" name="emailid">${errs.mailid}<br>
supervisor id<input type="text" name="super_id"><br>
role<input type="text" name="role"><br>
desig<input type="text" name="desig"><br>
country <input type="text" name="country"><br>
dob <input type="text" name="dob"><br>
experience<input type="text" name="exprnce"><br>
password <input type="password" name="pwd"><br>

<input type="submit" value="add">
</form>
</body>
</html>