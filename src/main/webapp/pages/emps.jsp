<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Data</h2>
<table>

  <thead>
  <tr>
  <td>Emp Id</td>
   <td>Emp Name</td>
    <td>Emp City</td>
     <td>Emp Age</td>
  </tr>
  
  </thead>
  <tbody>
    <c:forEach items="${e}" var="employee">
      <tr>
      
      <td>${employee.id}</td>
       <td>${employee.name}</td>
        <td>${employee.city}</td>
         <td>${employee.age}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>