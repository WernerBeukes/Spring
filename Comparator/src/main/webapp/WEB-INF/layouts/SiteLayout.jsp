<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
    <head>
        <title>Tiles Example</title>
    </head>
    <body>
        <ul>
            <li><tiles:insertAttribute name="header" /></li>
            <li><tiles:insertAttribute name="menu" /></li>
            <li><tiles:insertAttribute name="body" /></li>
            <li><tiles:insertAttribute name="footer" /></li>
        </ul>
    </body>
</html>
