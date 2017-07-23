<%-- 
    Document   : error_java
    Created on : Jun 9, 2017, 11:33:00 PM
    Author     : Royalty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Exception::Error</title>
    <link rel="stylesheet" type="text/css" href="css\stylesch4.css" />
    <style>
        h1{
            color: black;
            background-color:  rgb(146, 209, 61); 
            border-radius: 8px;
            padding: 10px;
        }
        p{
            font-size: 2em;
            text-align: center;
        }
    </style>
</head>
<body>

    <h1>Java Error:: Exception</h1>
    <p>Sorry java has thrown an exception</p>
    <p>To continue, click the Back button</p>
    
    <p>Details</p>
    <p>Type:: <%=exception.getClass()%></p>
    <p>Message <%=exception.getMessage()%></p>

</body>
</html>
