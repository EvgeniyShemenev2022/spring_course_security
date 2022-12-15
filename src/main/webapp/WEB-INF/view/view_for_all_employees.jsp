<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 15.12.2022
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h3>Information for all employee</h3>
<br>
<br>

<%--скрывает от всех пользователей, с другой ролью--%>
<security:authorize access="hasRole('HR')">
<input type="button" value="salary"
       onclick="window.location.href = 'hr_info'">
Only for HR staff
</security:authorize>

<br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="performance"
       onclick="window.location.href = 'manager_info'">
Only for Managers
</security:authorize>

</body>
</html>
