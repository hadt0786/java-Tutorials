<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration</h1>
    <form action="Register">
        <table cellpadding="3pt">
            <tr>
                <td>Username : </td>
                <td><input type="text" name="uname" size="20"/> </td>
            </tr>
            <tr>
                <td>Password : </td>
                <td><input type="password" name="pwd" size="20"/> </td>
            </tr>
            
            <tr>
                <td>Confirm Password : </td>
                <td><input type="password" name="pwd2" size="20"/> </td>
            </tr>
        </table>
        <p/>
         <input type="submit" value="Register"/>
      </form>
</body>
</html>