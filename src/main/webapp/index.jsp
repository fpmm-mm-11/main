<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>hello</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<form id="testForm" action="do.test" method="POST">
    <h4>SS</h4>
    <table class="simpletablestyle">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <!--  iterate on the member list @named attribute and display name,email and phone number

        -->
        <c:forEach items="${members}" var="ss">
            <tr>
                <td><c:out value="${ss.id}"/></td>
                <td><c:out value="${ss.name}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <p>
        <input id="register" type="submit" value="servletTest" name="action">
    </p>
    <p>
        <label style="color: green;width: 100%;text-align: left;">${infoMessage}</label>
    </p>
</form>
</head>
</html>