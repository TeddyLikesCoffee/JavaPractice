<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("name") %><br/>
Gender: <%= request.getParameter("gender") %><br/>
Language: <%

String [] languages = request.getParameterValues("Languge");
if(languages != null){
	for(int x=0;x<languages.length;x++){
		out.print("\n");
		out.print(languages[x]);
	}
}else{
	out.print("No Language was selected!");
}
%><br/>
Country: <%= request.getParameter("country") %><br/>


</body>
</html>