<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get question detail</title>
</head>
<body>
${question.questionid}
<br />
${question.qtitle}
<br />
${question.qcontent}
<br />
${question.qcreateuserid}
<br />
${question.qupdateuserid}
<br />
${question.qcreatetime}
<br />
${question.qupdatetime}
<br />
${question.qgoodnum}
<br />
${question.qbadnum}
<br />
${question.qlabel}
<br />
${question.qstaus}
<br />
${question.qviewtimes}
<br />
</body>
</html>