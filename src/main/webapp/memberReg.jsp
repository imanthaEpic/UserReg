<%-- 
    Document   : memberReg
    Created on : Mar 12, 2024, 2:57:45 PM
    Author     : imantha_o
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Registration</h1>
        
        <form action="Register" method="post">
            <table>
                <tr><td>User Name</td><td><input type="text" name="uname"></td></tr>
                <tr><td>Password</td><td><input type="password" name="password"></td></tr>
                <tr><td>Email</td><td><input type="email" name="email"></td></tr>
                <tr><td>Phone</td><td><input type="text" name="phone"></td></tr>
                <tr><td></td><td><input type="submit" value="Register"></td></tr>
            </table>
        </form>
    </body>
</html>
