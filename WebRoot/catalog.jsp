<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>左边目录</title>
<base target="mainFrame">
<meta http-equiv="Content-Type" content="text/html">
<LINK REL="stylesheet" TYPE="text/css" href="script/outbar.css">
<script language="JavaScript1.2" src="script/folders.js" type="text/javascript"></script>
<script language="JavaScript1.2" src="script/outbar.js" type="text/javascript"></script>
</head>
<body link="#000000"  vlink="#000000" onload="winLoad()"   link="#000000" style="text-align:center">
<script language="JavaScript">
		new COOLjsOutlookBar(OutlookBar);
</script>
</body>
</html>
