<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试</title>
</head>
<body>
   <table>
      <tr>
        <td>编号</td>
      </tr>
       <c:forEach items="${list}" var="ids">
         <tr>
           <td>${ids}</td>
         </tr>
       </c:forEach>
   </table>
   <%
    out.print(request.getContextPath());
   %>
   <a href="<%=request.getContextPath()%>/userList/insert">点击插入数据</a>
   <a href="<%=request.getContextPath()%>/userList/batchinsert">批量插入</a>
</body>
</html>