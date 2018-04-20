<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Teck Skills </h1>

<form action="mycredential">
 Employee id <Input type="text" name="txtid"> <br>
 Password <input type="password" name="txtpwd">  <font color='red'> ${pwd}</font> <br>

<input type="radio" value="e"> Employer 
<input type="radio" value="r"> Register
<input type="radio" value="h>"> HR
<input type="submit" value="Login"> <br>

</form>

</body>
</html>