<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
    <head>
        <tiles:insertAttribute name="imports" />
    </head>
    <body>
        <div>
            <span><tiles:insertAttribute name="header" /></span>
            <span><tiles:insertAttribute name="menu" /></span>
            <span><tiles:insertAttribute name="body" /></span>
            <span><tiles:insertAttribute name="footer" /></span>
        </div>
    </body>
</html>
