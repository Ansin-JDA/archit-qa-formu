<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Ueditor Demo</title>

<meta http-equiv="pragma"content="no-cache">
<meta http-equiv="cache-control"content="no-cache">
<meta http-equiv="expires"content="0">
<meta http-equiv="keywords"content="keyword1,keyword2,keyword3">
<meta http-equiv="description"content="This is my page">
<script type="text/javascript"src="ueditor/ueditor.config.js"></script>
<script type="text/javascript"src="ueditor/ueditor.all.js"></script>
<LINK rel="stylesheet" type="text/css" href="ueditor/themes/default/css/ueditor.css">
</head>

<body>
<form action="publish.action"method="post">
类别： <input type="text"name="category"/><br/>
标题：<input type="text"name="title"/><br/>

<textarea name="content" id="myEditor">这里写你的初始化内容</textarea>
<script type="text/javascript">
var editor =new UE.ui.Editor();
editor.render("myEditor");
//1.2.4以后可以使用一下代码实例化编辑器
//UE.getEditor('myEditor')
</script>
<input type="submit"value="提交"/>

</form>

</body>
</html>