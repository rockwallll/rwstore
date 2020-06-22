<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
   <form action="<%=request.getContextPath()%>/Getservle" method="post">
      <h1 align="center">添加学生信息</h1>
      <table align="center">
          <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
          </tr>
          <tr>
            <td>手机号</td>
            <td><input type="text" name="telephone"></td>
          </tr>
          <tr>
            <td>性别</td>
            <td>
              <input type="radio" name="sex" value="男">男
              <input type="radio" name="sex" value="女">女
            </td>
          </tr>
          <tr>
            <td>专业</td>
            <td><input type="text" name="profession"></td>
          </tr>
          <tr>
            <td>学号</td>
            <td><input type="text" name="id"></td>
          </tr>
          <tr>
            <td>
            <button type="submit">提交</button>
            </td>
            <td>
            <button type="reset">重置</button>
            </td>
          </tr>
      </table>
   </form>
</body>
</html>