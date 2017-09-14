<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试</title>
<script type="text/javascript">
 window.onload=function(){
	 var path=document.getElementById("path").value;
	 //window.location.href=path+"/userList/list";
	 console.log("页面初始化完成");
	 
 };
</script>
<style type="text/css">
table{
 border:1px solid pink;
 width:400px;
}
table td{
 border:1px solid blue;
}

</style>
</head>
<body>
  <input id="path" type="hidden" value="<%=request.getContextPath()%>"/>
   <%
    out.print(request.getContextPath());
   %>
   <a href="<%=request.getContextPath()%>/userList/list">查询数据</a>
   <a href="<%=request.getContextPath()%>/userList/insert">点击插入数据</a>
   <a href="<%=request.getContextPath()%>/userList/batchinsert">批量插入</a>
   <a href="<%=request.getContextPath()%>/userList/update">修改</a>
   <a href="<%=request.getContextPath()%>/userList/delete">删除</a>
   <a href="<%=request.getContextPath()%>/register.jsp">新增</a>
   <table style="boder:1px;" cellspacing="0" cellpadding="0">
      <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>年龄</td>
        <td colspan="2">操作</td>
      </tr>
       <c:forEach items="${list}" var="ids">
         <tr>
           <td>${ids.id}</td>
           <td>${ids.userName}</td>
           <td>${ids.passwd}</td>
           <td>${ids.age}</td>
           <td><a href="<%=request.getContextPath()%>/userList/updateById?id=${ids.id}">修改</a></td>
           <td><a href="<%=request.getContextPath()%>/userList/deleteById?id=${ids.id}">删除</a></td>
         </tr>
       </c:forEach>
   </table>

</body>
</html>
