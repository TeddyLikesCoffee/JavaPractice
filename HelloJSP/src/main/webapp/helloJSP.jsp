<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!
 String fName="Miriam";
 String lName="Pantoja";
 int age =30;
%>
<body>
 Person name: <%=fName+" "+lName %><br>
 The current date is <%= new java.util.Date() %>
</body>
</html>