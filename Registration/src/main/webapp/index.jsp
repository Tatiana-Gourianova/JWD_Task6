<%@ page language="java" contentType="text/html; 
    charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<!-- <html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>-->
<!-- Please, fill <a href="WEB-INF/jsp/registration.jsp "> the registration form </a>-->
<!-- Please, fill <a href="jsp/registration.jsp "> the registration form </a>

//<%
    //	response.sendRedirect("controller?command=gotoindexpage");
    //%>
</body>
</html>

-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <title><fmt:message key="title.index.page"/></title>
    <style>
        body {
            background: url(images/bv.jpg);
        }
    </style>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<%
    //	response.sendRedirect("/controller?command=gotoindexpage");
%>
<center>
<br>
<h2>&nbsp;&nbsp;&nbsp;&nbsp;Welcome to shop of eye trainers</h2>

    <br>
    <br>
    <p>Today <%= new java.util.Date() %>
    </p>
    <br>
    <!--   <h3><a href="/sss"> &Rscr;egistration</a>-->
    <h3><a href="/WEB-INF/jsp/registration.jsp"> &Rscr;egistration</a>

        </p>
        <p>

            <!--				<img src="/images/logo.jpg">

                    <a href="login.jsp"> &Sscr;tart training </a>-->
            <br>
            <br>
            <br>

            <a href="/index">&phone;</a>
        </p></h3>
</center>
</body>
</html>
