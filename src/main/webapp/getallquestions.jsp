<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<%@ page import="com.knowledge.infra.server.model.Question" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Questions</title>
</head>
<body>
<c:forEach  items="${questionList}" var="question">
           <c:out value="${question.questionid}"></c:out>
           <c:out value="${question.qtitle}"></c:out>
           <c:out value="${question.qcontent}"></c:out>
</c:forEach>
</body>
</html>
