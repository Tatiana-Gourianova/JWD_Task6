<%--@elvariable id="typesList" type="java.util.ArrayList"--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../include/uselocale.jsp" %>
<html>
<head>
    <title><fmt:message key="title.show.all.types.page"/></title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: url(../images/fon1.jpg);
        }
    </style>
</head>
<body>
<%@ include file="../include/navbar.jsp" %>
<div class="container-fluid">
    <div class="col-md-6 col-md-offset-6">
        <table class="table table-condensed table-bordered">
            <tr>
                <td align="center" style="border-color: #dae5ff"><fmt:message key="table.type.id"/></td>
                <td align="center" style="border-color: #dae5ff"><fmt:message key="table.type.type"/></td>
                <td align="center" style="border-color: #dae5ff"><fmt:message key="table.type.price"/></td>
                <td align="center" style="border-color: #dae5ff"><fmt:message key="table.type.photo"/></td>
            </tr>
            <c:forEach items="${typesList}" varStatus="сounter">
                <tr>
                    <td align="center" style="vertical-align: middle; border-color: #dae5ff">${typesList[сounter.count-1].id}</td>
                    <td align="center" style="vertical-align: middle; border-color: #dae5ff">${typesList[сounter.count-1].type}</td>
                    <td align="center" style="vertical-align: middle; border-color: #dae5ff">${typesList[сounter.count-1].price}</td>
                    <td align="center" style="vertical-align: middle; border-color: #dae5ff"><img src="data:image/jpeg;base64,${typesList[сounter.count-1].image}"/>
                </tr>
            </c:forEach>
        </table>
        <a href="/controller?action=show_admin_page" class="btn btn-default"><fmt:message key="continue"/></a>
    </div>
</div>
<%@ include file="../include/footer_admin.jsp" %>
</body>
</html>



