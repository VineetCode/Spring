<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Details :</title>
</head>
<body>
<h3>You have successfully registered with following Info ::</h3>
 </body>
 <a href="/SpringMVCRequestParam">Back</a>
   <table>
   
     <tr>
       <td>User Name :</td>
       <td>${user.name}</td>
     </tr>
   <tr>
       <td>User age :</td>
       <td>${user.age}</td>
     </tr>
     <tr>
       <td>User email :</td>
       <td>${user.email}</td>
     </tr>
     <tr>
       <td>User Country :</td>
       <td>${user.country}</td>
     </tr>
   
   
   </table>
 
 

</html>