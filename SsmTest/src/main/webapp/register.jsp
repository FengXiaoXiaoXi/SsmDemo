<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <form action="<%=request.getContextPath()%>/userList/register" method="post">
   编号:<input type="text" name="id" value="10000"/><br>
   姓名:<input type="text" name="userName"/><br>
   密码:<input type="password" name="passwd" value="123456"/><br>
   年龄:<input type="text" name="age" value="23"/><br>
 <input type="submit" value="注册"/> <br>
 </form>
</body>
</html>