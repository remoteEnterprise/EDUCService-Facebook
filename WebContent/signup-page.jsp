<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<h1>EDUCService Sign Up</h1>
</head>
<body>
	<form action="SignUpAction.bee">
		<input type="text" name="login" placeholder="Login" required/>
		<input type="password" name="password" placeholder="Password" required/>
		<input type="text" name="email" placeholder="Email" required/></br>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>