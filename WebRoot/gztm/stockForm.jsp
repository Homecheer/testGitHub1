<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<script language="javascript" src="script/common.js" ></script>
	<script type="text/javascript" src="script/productDiv.js" ></script>
	<script type="text/javascript">
		function yearMonth(){
			var home=document.getElementById("select");
			for(var i=2017;i>=2000;i--){
				for(var j=1;j<=12;j++){
					var opt=document.createElement("option");
					if(j<=9){
						opt.innerHTML=i+"-0"+j;
					}else{
						opt.innerHTML=i+"-"+j;
					}
					home.appendChild(opt);
					}
	}
		}
		
	</script>
  </head>
  
  <body>
    <div id="update">
	<form action="StockForm">
	<table width="100%"  border="0" align="center" cellspacing="1" class="c">
  <tr>
    <td align="center">选择年月</td>
    <td align="center">
    	<select name="startTime" id="select" onclick="yearMonth()" >
    		<option>2017-09</option>
    	</select>
    </td>
	</tr>
 
  <tr>
    <td height="18" colspan="2" align="center"><input type="reset"/> <input type="submit" value="查询"/></td>
    </tr>
</table>
</form>
<br>
产品总库存数:${thenStock}
<table width="100%"  border="0" align="center" cellspacing="1" class="c">
  <tr>
  	<td align="center">产品编号</td>
  	<td align="center">产品名称</td>
  	<td align="center">库存数</td>
  </tr>
  <c:forEach items="${stock }" var="st">
  <tr>
  	<td align="center">${st.productCode }</td>
  	<td align="center">${st.name }</td>
  	<td align="center">${st.num }</td>
  </tr>
  </c:forEach>
</table>
</div>
<iframe width=174 height=189 name="gToday:normal:agenda.js" id="gToday:normal:agenda.js" src="common/calendar/ipopeng.htm" scrolling="no" frameborder="0" style="visibility:visible; z-index:999; position:absolute; left:-500px; top:0px;"></iframe>
  </body>
</html>
