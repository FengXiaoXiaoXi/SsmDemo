<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
  function openOne(){
	  var db=document.getElementById("bd");
	  var path=document.getElementById("path");
      path="http://localhost:8080/SsmDemo/userList/list";
	  window.showModalDialog(path,"","dialogWidth=500px;dialogHeight=500px;resizable=yes");
  }
  function openTwo(){
	  var path=document.getElementById("path");
	  window.open(path);
  }

</script>
</head>
<body id="bd">
  <input type="hidden" value="<%=request.getContextPath()%>/userList/list" id="path"/>
  <input type="button" onclick="openOne();" value="打开模态窗口"/>
  <input type="button" onclick="openTwo();" value="打开非模态窗口"/>
</body>
</html>