<%-- 
    Document   : index
    Created on : 2017-07-12, 12:06:44
    Author     : Artur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User List</title>
    </head>
    <body>
        <h1>User List</h1>
        <form action="./UserServlet" method="POST">
            <table>
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="userId" value="${user.userId}"/></td>
                </tr>
                <tr>
                    <td>Login</td>
                    <td><input type="text" name="login" value="${user.login}"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password" value="${user.password}"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${user.name}"/></td>
                </tr>
                <tr>
                    <td>Telephone Number</td>
                    <td><input type="text" name="telephoneNumber" value="${user.telephoneNumber}"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border ="1">
            <th>ID</th>
            <th>Login</th>
            <th>Password</th>
            <th>Name</th>
            <th>TelephoneNumber</th>
                <c:forEach items="${allUsers}" var="us">
                <tr>
                    <td>${us.userId}</td>
                    <td>${us.login}</td>
                    <td>${us.password}</td>
                    <td>${us.name}</td>
                    <td>${us.telephoneNumber}</td>
                    <td></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
