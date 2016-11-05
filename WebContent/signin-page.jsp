<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<h1>EDUCService Login</h1>
</head>
<body>
	<form action="SignInAction.bee" method="post">
		<input type="text" placeholder="Login" name="login" required/>
		<input type="password" placeholder="Password"  name="password" required/></br></br>
		<input type="submit" value="Sign In"/>
	</form>
	<form action="signup-page.jsp" method="post">
		<input type="submit" value="Sign Up"/>
	</form>
</body>
</html>