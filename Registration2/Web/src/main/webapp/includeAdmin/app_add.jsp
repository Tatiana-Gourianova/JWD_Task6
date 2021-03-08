<%--@elvariable id="typesList" type="java.util.ArrayList"--%>
<%--@elvariable id="stationsList" type="java.util.ArrayList"--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../include/uselocale.jsp" %>
<html>
<head>
    <script type="text/javascript" src="../js/validator.js"></script>
    <title><fmt:message key="title.add.app.page"/></title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%@ include file="../include/navbar.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-2">
            <form action="/controller" method="post" class="form-horizontal">
                <input type="hidden" name="action" value="add_app">
                <div class="form-group">
                    <label for="type" class="col-sm-3 control-label"><fmt:message key="add.app.form.type"/></label>
                    <div class="col-sm-9">
                        <select class="form-control" id="type" name="typeId">
                            <c:forEach items="${typesList}" var="type">
                                <option value="${type.id}">${type.id}, ${type.type}, ${type.price}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="station" class="col-sm-3 control-label"><fmt:message key="add.app.form.httpAddresses"/></label>
                    <div class="col-sm-9">
                        <select class="form-control" id="station" name="stationId">
                            <c:forEach items="${stationsList}" var="station">
                                <option value="${station.id}">${station.id}, ${station.city}, ${station.location}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-9">
                        <button type="submit" class="btn btn-primary"><fmt:message key="add.app.form.submit"/></button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<%@ include file="../include/footer_admin.jsp" %>
</body>
</html>


